package Controlador;

import Modelo.Cita;
import Modelo.Cliente;
import Modelo.Consulta;
import Modelo.Mascota;
import Modelo.MascotaConvencional;
import Modelo.MascotaExotica;
import Modelo.Vacuna;
import Modelo.Veterinario;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ControladorVet {

    private final List<Cliente> clientes = new ArrayList<>();
    private final List<Mascota> mascotas = new ArrayList<>();
    private final List<Veterinario> veterinarios = new ArrayList<>();
    private final List<Cita> citas = new ArrayList<>();

    public ControladorVet() {
        veterinarios.add(new Veterinario("1092535876", "Tite Perez", "3131234567", "Calle 1 #2-3",
                "Veterinario", "", "", "Medicina general", "TP-001"));
        veterinarios.add(new Veterinario("1093456123", "Emily Azules", "3107654321", "Calle 4 #5-6",
                "Veterinario", "", "", "Animales exoticos", "TP-002"));
        veterinarios.add(new Veterinario("1092567809", "Jose Solano", "3239876543", "Calle 7 #8-9",
                "Veterinario", "", "", "Cirugia", "TP-003"));
    }

    public void registrarCliente(String cedula, String nombre,
                                 String telefono, String direccion) {
        if (buscarCliente(cedula) != null) {
            throw new IllegalArgumentException(
                    "Ya existe un cliente registrado con la cédula " + cedula);
        }
        clientes.add(new Cliente(cedula, nombre, telefono, direccion));
    }

    public void registrarMascotaConvencional(String cedulaDueno, String id, String nombre,
                                             int edad, double peso, String raza) {
        Cliente dueno = buscarClienteObligatorio(cedulaDueno);
        validarIdDisponible(id);

        Mascota mascota = new MascotaConvencional(nombre, id, edad, peso, raza);
        dueno.agregarMascota(mascota);
        mascotas.add(mascota);
    }

    public void registrarMascotaExotica(String cedulaDueno, String id, String nombre,
                                        int edad, double peso, String permisoCITES,
                                        boolean requiereSedacion) {
        Cliente dueno = buscarClienteObligatorio(cedulaDueno);
        validarIdDisponible(id);

        MascotaExotica mascota = new MascotaExotica(nombre, id, edad, peso,
                                                    permisoCITES, requiereSedacion);
        if (!mascota.validarPermiso()) {
            throw new IllegalArgumentException(
                    "Una mascota exótica requiere un permiso CITES válido");
        }

        dueno.agregarMascota(mascota);
        mascotas.add(mascota);
    }

    public List<Veterinario> obtenerVeterinarios() {
        return new ArrayList<>(veterinarios);
    }

    public Cita agendarCita(String idMascota, String cedulaVeterinario,
                            LocalDateTime fechaHora) {
        if (fechaHora == null) {
            throw new IllegalArgumentException("Debe indicar la fecha y la hora de la cita");
        }

        Mascota mascota = buscarMascota(idMascota);
        if (mascota == null) {
            throw new IllegalArgumentException(
                    "No existe una mascota con el ID " + idMascota);
        }

        Veterinario veterinario = buscarVeterinario(cedulaVeterinario);
        if (veterinario == null) {
            throw new IllegalArgumentException(
                    "No existe un veterinario con la cédula " + cedulaVeterinario);
        }

        Cita cita = new Cita(fechaHora, mascota, veterinario);
        citas.add(cita);
        return cita;
    }


    public Consulta registrarConsulta(String idMascota, String cedulaVeterinario,
                                      String diagnostico, String tratamiento,
                                      String notasMedicas, String nombreVacuna,
                                      double valorVacuna) {
        Mascota mascota = buscarMascota(idMascota);
        if (mascota == null) {
            throw new IllegalArgumentException(
                    "No existe una mascota con el ID " + idMascota);
        }

        Veterinario veterinario = buscarVeterinario(cedulaVeterinario);
        if (veterinario == null) {
            throw new IllegalArgumentException(
                    "No existe un veterinario con la cédula " + cedulaVeterinario);
        }

        boolean hayVacuna = nombreVacuna != null && !nombreVacuna.isBlank();
        if (hayVacuna && valorVacuna < 0) {
            throw new IllegalArgumentException("El valor de la vacuna no puede ser megativo");
        }

        Consulta consulta = new Consulta(LocalDate.now(), diagnostico, veterinario,
                                         mascota, tratamiento, notasMedicas);
        if (hayVacuna) {
            consulta.agregarVacunaAplicada(
                    new Vacuna(nombreVacuna, valorVacuna, LocalDate.now()));
        }

        mascota.getHistorial().agregarConsulta(consulta);
        return consulta;
    }

    private Cliente buscarCliente(String cedula) {
        for (Cliente c : clientes) {
            if (c.getCedula().equals(cedula)) {
                return c;
            }
        }
        return null;
    }

    private Mascota buscarMascota(String id) {
        for (Mascota m : mascotas) {
            if (m.getId().equals(id)) {
                return m;
            }
        }
        return null;
    }

    private Veterinario buscarVeterinario(String cedula) {
        for (Veterinario v : veterinarios) {
            if (v.getCedula().equals(cedula)) {
                return v;
            }
        }
        return null;
    }

    private Cliente buscarClienteObligatorio(String cedula) {
        Cliente cliente = buscarCliente(cedula);
        if (cliente == null) {
            throw new IllegalArgumentException(
                    "No existe un cliente con la cédula " + cedula);
        }
        return cliente;
    }

    private void validarIdDisponible(String id) {
        if (buscarMascota(id) != null) {
            throw new IllegalArgumentException(
                    "El ID de mascota " + id + " ya está en uso");
        }
    }
}