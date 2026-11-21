package Modelo;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;


public class Consulta {
    private LocalDate fecha;
    private Veterinario veterinario;
    private Mascota mascota;
    private String tratamiento;
    private String notasMedicas;
    private List<Vacuna> vacunasAplicadas;
    private String diagnostico;
    
    public Consulta(LocalDate fecha, String diagnostico, Veterinario veterinario, Mascota mascota, String tratamiento, String notasMedicas){
        this.fecha = fecha;
        this.diagnostico = diagnostico;
        this.mascota = mascota;
        this.veterinario = veterinario;
        this.tratamiento  = tratamiento;
        this.notasMedicas = notasMedicas;
        this.vacunasAplicadas = new ArrayList<>();
        
    }
    
    public void agregarVacunaAplicada(Vacuna vacuna){
        vacunasAplicadas.add(vacuna);
    }
    public Cobro generarCobro(Cliente cliente){
        double tarifaBase = 50000;
        double costoVacunas = 0;
        double costoSedacion = 0;
        double recargo = mascota.calcularRecargo(tarifaBase);
        
        //Vacunas aplicadas durante la consulta
         if (mascota instanceof MascotaConvencional) {
        for (Vacuna vacuna : vacunasAplicadas) {
            costoVacunas += vacuna.getCosto();
        }
    }
        
        //Sedacion en mascotas exoticas
        if(mascota instanceof MascotaExotica exotica){
            if(exotica.isRequiereSedacion()){
                costoSedacion = 20000;
            }
        }
        
        //Subtotal
        double subtotal = tarifaBase + costoVacunas
                    + recargo + costoSedacion;;
        
        //Descuento del 10% por tener mas de dos mascotas
        double descuento = 0;
        
        if(cliente.tieneBeneficio()){
            descuento = subtotal * 0.10;
        }
        
        double total = subtotal - descuento;
        
        return new Cobro(tarifaBase, costoVacunas, recargo, costoSedacion, descuento, total);
    }
    
    
}
