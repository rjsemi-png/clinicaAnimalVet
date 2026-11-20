package Modelo;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class HistorialClinico {
    private LocalDate fechaCreacion;
    private List<Consulta> consultas;
    
    public HistorialClinico(){}
    
    public void agregarConsulta(Consulta c){
        
    }
    
    public List<Consulta> obtenerConsultas(){
        return consultas;
    }
    
}
