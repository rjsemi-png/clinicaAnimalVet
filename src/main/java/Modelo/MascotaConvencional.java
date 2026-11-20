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
    
    public MascotaConvencional(String nombre, String id, int edad, double peso, String tipo, String raza, List<Vacuna> vacunas){
        super(nombre, id, edad, peso, tipo);
        this.raza = raza;
    }
    
    @Override
    public double calcularRecargo(double tarifaBase){
        return tarifaBase;
    }
    
    @Override
    public String getTipo(){
        return Mascota.getTipo();
    }
}
