package Modelo;

public class MascotaExotica extends Mascota{
    private String permisoCITES;
    private boolean requiereSedacion;
    
    public MascotaExotica(String nombre, String id, int edad, double peso, String permisoCITES, boolean requiereSedacion){
        super(nombre, id, edad, peso, "Exotica", new HistorialClinico());
        this.permisoCITES = permisoCITES;
        this.requiereSedacion = requiereSedacion;
    }
    
    public boolean validarPermiso(){
        return false;
    }
    
    @Override
    public double calcularRecargo(double tarifaBase){
        tarifaBase += tarifaBase *0.25;
        return tarifaBase;
    }
    
    @Override
    public String getTipo(){
        return "Exotica";
    }
}
