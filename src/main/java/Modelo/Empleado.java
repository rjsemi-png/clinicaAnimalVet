/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author eduar
 */
public class Empleado extends Persona{
    private String usuario;
    private String contrasena;
    private String rol;
    
    public Personal(String cedula, String nombre, String telefono, String direccion, String usuario, String contrasena, String rol){
        super(cedula, nombre, telefono, rol);
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.rol = rol;
    }
    
    
}
