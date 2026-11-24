package Modelo;


public abstract class Mascota {
    private String nombre;
    private String id;
    private int edad;
    private double peso;
    private HistorialClinico historial;
    
    public Mascota(String nombre, String id, int edad, double peso){
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.peso = peso;
        this.historial = new HistorialClinico();
    }
    
    public String getId(){
        return id;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public HistorialClinico getHistorial(){
        return historial;
    }
    
    public abstract double calcularRecargo(double tarifaBase);
    
    
    public abstract String getTipo();
    
    
    
    
}