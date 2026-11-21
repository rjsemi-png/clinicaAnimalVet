package Modelo;

import java.util.List;
import java.util.ArrayList;

public class Cliente extends Persona{
    private final List<Mascota> mascotas = new ArrayList<>();
    
    public Cliente(String cedula, String nombre, String telefono, String direccion){
        super(cedula, nombre, telefono, direccion);
    }
    
    public void agregarMascota(Mascota m){
        mascotas.add(m);
    }
    
    public boolean tieneBeneficio(){
        return mascotas.size() > 2;
    }
    
    public boolean eliminarMascota(Mascota m){
        return mascotas.remove(m);
    }
    
    public List<Mascota> getMascotas(){
        return new ArrayList<>(mascotas);
    }
}
