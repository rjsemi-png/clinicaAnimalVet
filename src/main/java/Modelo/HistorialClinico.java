package Modelo;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class HistorialClinico {
    private LocalDate fechaCreacion;
    private List<Consulta> consultas;
    
    public HistorialClinico(){
        fechaCreacion = LocalDate.now();
        this.consultas = new ArrayList<>();
    }
    
    public void agregarConsulta(Consulta consulta){
        
        consultas.add(consulta);
    }
    
    public List<Consulta> getConsultas(){
        return new ArrayList<>(consultas);
    }
    
}
