package Modelo;

import java.time.LocalDate;


public class Vacuna {
    private String nombre;
    private double costo;
    private LocalDate fechaAplicacion;
    
    public Vacuna(String nombre, double costo, LocalDate fechaAplicacion){
        this.nombre = nombre;
        this.costo = costo;
        this.fechaAplicacion = fechaAplicacion;
    }
    
    public double getCosto(){
        return costo;
    }
    
    public String getNombre(){
        return nombre;
    }
}
