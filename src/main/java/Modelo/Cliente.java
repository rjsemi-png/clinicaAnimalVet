package Modelo;

import java.util.List;
import java.util.ArrayList;

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
    
    public boolean eliminar(Mascota m){
        return false;
    }
    
    public List<Mascota> getMascota(){
        return new ArrayList<>(mascotas);
    }
}
