package Modelo;


public abstract class Mascota {
    private String nombre;
    private String id;
    private int edad;
    private double peso;
    private String tipo;
    private HistorialClinico historialclinico;
    
    public Mascota(String nombre, String id, int edad, double peso, String tipo, HistorialClinico historialclinico){
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.peso = peso;
        this.tipo = tipo;
        this.historialclinico = historialclinico;
    }
    
    public String getId(){
        return id;
    }
    
    public HistorialClinico getHistorial(){
        return historialclinico;
    }
    
    public double calcularRecargo(double tarifaBase){
        return tarifaBase;
    }
    
    public String getTipo(){
        //en UML dice abstract averiguar porque
        return tipo;
    }
    
    
    
}
