package Modelo;

public class Empleado extends Persona{
    private String rol;
    
    public Empleado(String cedula, String nombre, String telefono, String direccion,String rol){
        super(cedula, nombre, telefono, direccion);
        this.rol = rol;
    }
    
    
}
