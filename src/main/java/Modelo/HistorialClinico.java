package Modelo;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class HistorialClinico {
    private LocalDate fechaCreacion;
    private List<Consulta> consultas;
    private Consulta consulta;
    
    public HistorialClinico(){}
    
    public void agregarConsulta(Consulta c){
        consultas.add(c);
    }
    
    public List<Consulta> obtenerConsultas(){
        return consultas;
    }
    
}
