package Modelo;


public abstract class Persona {
    private String cedula;
    private String nombre;
    private String telefono;
    private String direccion;
    
    public Persona(String cedula, String nombre, String telefono, String direccion){
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
   
    }
    
}
