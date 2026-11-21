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
    
    public Consulta(LocalDate fecha, String diagnostico, Veterinario v){
        this.fecha = fecha;
        this.diagnostico = diagnostico;
        this veterinario = veterinario;
        
    }
    
    public Cobro generarCobro(){
        return Cobro;
    }
    
    
}
