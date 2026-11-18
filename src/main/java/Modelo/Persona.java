/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author eduar
 */
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
