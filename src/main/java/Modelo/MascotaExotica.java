package Modelo;

public class MascotaExotica extends Mascota{
    private String permisoCITES;
    private boolean requiereSedacion;
    
    public MascotaExotica(String nombre, String id, int edad, double peso, String permisoCITES, boolean requiereSedacion){
        super(nombre, id, edad, peso);
        this.permisoCITES = permisoCITES;
        this.requiereSedacion = requiereSedacion;
    }
    
    public boolean validarPermiso(){
        if(permisoCITES != null && !permisoCITES.isBlank()){
            return true;
        }
        return false;
    }
    
    
    @Override
    public double calcularRecargo(double tarifaBase){
        
        return tarifaBase*0.25;
    }
    
    @Override
    public String getTipo(){
        return "Exotica";
    }
    
    public boolean isRequiereSedacion() {
        return requiereSedacion;
    }

}
