/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author eduar
 */
public class Cliente extends Persona{
    private final List<Mascota> mascotas = new ArrayList<>();
    
    public Cliente(String cedula, String nombre, String telefono, String direccion){
        super(cedula, nombre, telefono, direccion);
    }
    
    public void agregarMascota(Mascota v){
        mascotas.add(v);
    }
    
    public boolean tieneBeneficio(){
        return false;
    }
}
