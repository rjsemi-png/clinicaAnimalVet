package Modelo;


public class Veterinario extends Empleado{
    private String especialidad;
    private String numTarjetaProfesional;
    
    public Veterinario(String cedula, String nombre, String telefono, String direccion, String rol, String especialidad, String numTarjetaProfesional){
        super(cedula, nombre, telefono, direccion, rol);
        this.especialidad = especialidad;
        this.numTarjetaProfesional = numTarjetaProfesional;
    }
    
    public void atenderCita(Cita cita){
    }
    
    public Consulta registrarConsulta(Cita cita, String diagnostico, String tratamiento, String notasMedicas){
        return consultas;
    }
    
    public HistorialClinico consultarHistorial(Mascota m){
        return historialclinico;
    }
}
