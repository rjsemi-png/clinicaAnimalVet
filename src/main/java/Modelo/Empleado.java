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
    private String rol;
    
    public Empleado(String cedula, String nombre, String telefono, String direccion,String rol){
        super(cedula, nombre, telefono, direccion);
        this.rol = rol;
    }
    
    
}
