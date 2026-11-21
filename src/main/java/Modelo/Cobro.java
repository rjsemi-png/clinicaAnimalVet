package Modelo;

public class Cobro {

    private double tarifaBase;
    private double recargo;
    private double descuento;
    private double total;
    private double costoVacunas;
    private double costoSedacion;

    public Cobro(double tarifaBase, double costoVacunas,
                 double costoSedacion, double recargo,
                 double descuento) {

        this.tarifaBase = tarifaBase;
        this.costoVacunas = costoVacunas;
        this.costoSedacion = costoSedacion;
        this.recargo = recargo;
        this.descuento = descuento;

        calcularTotal();
    }

    public double calcularTotal() {
        this.total = tarifaBase + costoVacunas + costoSedacion + recargo - descuento;

        return total;
    }

    public String emitirComprobante() {
        return "===== ANIMALVET ====="
             + "\nTarifa consulta: $" + tarifaBase
             + "\nVacunas aplicadas: $" + costoVacunas
             + "\nRecargo exotico: $" + recargo
             + "\nInsumos sedacion: $" + costoSedacion
             + "\nDescuento: -$" + descuento
             + "\n-----------------------"
             + "\nTOTAL: $" + total;
    }
}