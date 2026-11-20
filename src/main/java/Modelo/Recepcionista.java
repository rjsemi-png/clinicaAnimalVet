package Modelo;

import java.util.List;
import java.util.ArrayList;
import java.time.LocalDateTime;

public class Recepcionista extends Empleado{
    
    public Recepcionista(String nombre, String cedula, String telefono, String direccion, String rol){
        super(nombre, cedula, telefono, direccion, rol);
    }
    
    public void registrarCliente(Cliente c){
    }
    
    public Cliente registrarMascota(Cliente c, Mascota m){
        c.agregarMascota(m);
        return c;
    }
    
    public Cita agendarCita(Mascota m, Veterinario v, LocalDateTime fechaHora){
        return null;
    }
    
    public List<Cita> consultarCitas(){
        return new ArrayList<>();
    }
    
    public Cobro generarCobro(Consulta c){
        return null;
    }
}
