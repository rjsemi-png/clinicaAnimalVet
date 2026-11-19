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
public class Recepcionista extends Empleado{
    
    public Recepcionista(String nombre, String cedula, String telefono, String direccion, String rol){
        super(nombre, cedula, telefono, direccion, rol);
    }
    
    public void registrarCliente(Cliente c){
    }
    
    public Cliente registrarMascota(Cliente c, Mascota m){
        return Cliente;
    }
    
    public Cita agendarCita(Mascota m, Veterinario v, LocalDataTime fechaHora){
        return Cita;
    }
    
    public List<Cita> consultarCitas(){
        return new ArrayList<>(citas);
    }
    
    public Cobro generarCobro(Consulta c){
        return Cobro;
    }
}
