package modelos;

public class calcularSueldoProfesor {
    private int aniosdeTrabajo;
    private double BonoFijo;
    
    public double calcularSueldo(Profesor prof)
    {
        return aniosdeTrabajo * 600 + BonoFijo;
    }  
    
}
