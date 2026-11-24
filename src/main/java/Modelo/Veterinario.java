
package Modelo;

import java.time.LocalDate;

public class Veterinario extends Empleado {

    private String especialidad;
    private String numTarjetaProfesional;

    public Veterinario(String cedula, String nombre,
                       String telefono, String direccion,
                       String rol, String tratamiento,
                       String notasMedicas, String especialidad,
                       String numTarjetaProfesional) {

        super(cedula, nombre, telefono, direccion, "Veterinario");

        this.especialidad = especialidad;
        this.numTarjetaProfesional = numTarjetaProfesional;
    }

    public void atenderCita(Cita cita) {

        if (cita == null) {
            throw new IllegalArgumentException(
                "La cita no puede ser nula");
        }

        if (cita.getVeterinario() != this) {
            throw new IllegalArgumentException(
                "La cita pertenece a otro veterinario");
        }

        cita.marcarAtendida();
    }

    public Consulta registrarConsulta(Cita cita,
                                      String diagnostico,
                                      String tratamiento,
                                      String notasMedicas) {

        if (cita == null) {
            throw new IllegalArgumentException(
                "La cita no puede ser nula");
        }

        if (cita.getVeterinario() != this) {
            throw new IllegalArgumentException(
                "La cita pertenece a otro veterinario");
        }

        Mascota mascota = cita.getMascota();

        Consulta consulta = new Consulta(
            LocalDate.now(),
            diagnostico,
            this,
            mascota,
            tratamiento,
            notasMedicas
        );

        mascota.getHistorial().agregarConsulta(consulta);

        return consulta;
    }

    public HistorialClinico consultarHistorial(Mascota m) {

        if (m == null) {
            throw new IllegalArgumentException(
                "La mascota no puede ser nula");
        }

        return m.getHistorial();
    }
}
