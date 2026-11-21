package Modelo;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author eduar
 */
public class MascotaConvencional extends Mascota{
    private String raza;
    private List<Vacuna> vacunas;
    
    public MascotaConvencional(String nombre, String id, int edad, double peso, String raza, List<Vacuna> vacunas){
        super(nombre, id, edad, peso);
        this.raza = raza;
        this.vacunas = new ArrayList<>();
    }
    
    @Override
    public double calcularRecargo(double tarifaBase){
        return 0;
    }
    
    @Override
    public String getTipo(){
        return "Convencional";
    }
}
