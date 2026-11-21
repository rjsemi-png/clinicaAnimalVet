package Modelo;

public class Cobro {
    private double tarifaBase;
    private double recargo;
    private double descuento;
    private double total;
    
    // preguntar pq no tiene constructor
    public Cobro(double tarifaBase, double recargo, double descuento, double total){
        this.tarifaBase = tarifaBase;
        this.recargo = recargo;
        this.descuento = descuento;
        this.total = total;
    }
    
    public double calcularTotal(Mascota m, Cliente c){
        total += tarifaBase + recargo - descuento;
        return total;
    }
    
    public String emitirComprobante(){
        return "Comprobante";
    }
}
