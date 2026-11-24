
package Modelo;

import java.util.List;
import java.util.ArrayList;
import java.time.LocalDateTime;

public class Recepcionista extends Empleado {

    private List<Cliente> clientes;
    private List<Cita> citas;

    public Recepcionista(String cedula, String nombre,
                        String telefono, String direccion,
                        String rol, List<Cliente> clientes,
                        List<Cita> citas) {

        super(cedula, nombre, telefono, direccion, rol);

        this.clientes = clientes;
        this.citas = citas;
    }

    public void registrarCliente(Cliente c) {
        if (c == null) {
            throw new IllegalArgumentException(
                "El cliente no puede ser nulo");
        }

        clientes.add(c);
    }

    public void registrarMascota(Cliente c, Mascota m) {
        if (c == null || m == null) {
            throw new IllegalArgumentException(
                "El cliente y la mascota son obligatorios");
        }

        c.agregarMascota(m);
    }

    public Cita agendarCita(Mascota m, Veterinario v,
                            LocalDateTime fechaHora) {

        if (m == null || v == null || fechaHora == null) {
            throw new IllegalArgumentException(
                "Faltan datos para agendar la cita");
        }

        Cita cita = new Cita(fechaHora, m, v);
        citas.add(cita);

        return cita;
    }

    public List<Cita> consultarCitas() {
        return new ArrayList<>(citas);
    }

    public Cobro generarCobro(Consulta c) {
        if (c == null) {
            throw new IllegalArgumentException(
                "La consulta no puede ser nula");
        }

        for (Cliente cliente : clientes) {
            if (cliente.getMascotas().contains(c.getMascota())) {
                return c.generarCobro(cliente);
            }
        }

        throw new IllegalArgumentException(
            "No se encontro el propietario de la mascota");
    }
}
