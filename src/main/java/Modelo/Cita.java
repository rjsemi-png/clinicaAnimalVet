package Modelo;

import java.util.LocalData;

public class Cita {
    private LocalDataTime fechaHora;
    private Mascota mascota;
    private Veterinario veterinario;
    private String estado;
    private int duracionMinutos = 20;
    
    public Cita(LocalDataTime fechaHora, Mascota m, Veterinario v){
        this.fechaHora = fechaHora;
        this.mascota = mascota;
        this.veterinario = veterinario;
    }
    
    public void confirmar(){}
    
    public void cancelar(){}
}
