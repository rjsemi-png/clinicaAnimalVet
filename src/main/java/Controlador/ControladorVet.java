package Controlador;

import Modelo.Cliente;
import Modelo.Mascota;
import Modelo.MascotaConvencional;
import Modelo.MascotaExotica;
import Modelo.Veterinario;

import java.util.ArrayList;
import java.util.List;

public class ControladorVet {

    private final List<Cliente> clientes = new ArrayList<>();
    private final List<Mascota> mascotas = new ArrayList<>();
    private final List<Veterinario> veterinarios = new ArrayList<>();

    public ControladorVet() {
        // Veterinarios precargados, ya que no hay botón para registrarlos
        veterinarios.add(new Veterinario("1001", "Tite Galviz", "1092535678", "Calle 1 #2-3",
                "Veterinario", "", "", "Medicina general", "TP-001"));
        veterinarios.add(new Veterinario("1002", "Emily Azules", "1093562782", "Calle 4 #5-6",
                "Veterinario", "", "", "Animales exoticos", "TP-002"));
        veterinarios.add(new Veterinario("1003", "Jose Solano", "1092789654", "Calle 7 #8-9",
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

    // Devuelve una copia de la lista para los desplegables de Citas y Consultas.
    // La Vista identifica al veterinario elegido con su cédula (getCedula()).
    public List<Veterinario> obtenerVeterinarios() {
        return new ArrayList<>(veterinarios);
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