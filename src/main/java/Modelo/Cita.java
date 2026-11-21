package Modelo;

import java.time.LocalDateTime;

public class Cita {
    private LocalDateTime fechaHora;
    private Mascota mascota;
    private Veterinario veterinario;
    private String estado;
    private int duracionMinutos = 20;
    
    public Cita(LocalDateTime fechaHora, Mascota mascota, Veterinario veterinario){
        this.fechaHora = fechaHora;
        this.mascota = mascota;
        this.veterinario = veterinario;
    }
    
    public void confirmar(){}
    
    public void cancelar(){}
}
