package modelos;

public class InformacionAdicionalProfesor {
    private int aniosdeTrabajo;
    private String facultad;
    private double BonoFijo;
    
    public int getAniosdeTrabajo()
    {
    	return aniosdeTrabajo;
    }
    public String getFacultad()
    {
    	return facultad;
    }
    public double getBonoFijo()
    {
    	return BonoFijo;
    }
    public void setAniosdeTrabajo(int _aniosdeTrabajo)
    {
    	aniosdeTrabajo = _aniosdeTrabajo;
    }
    public void setFacultad(String _facultad)
    {
    	facultad = _facultad;
    }
    public void setBonoFijo(int _bonoFijo)
    {
    	BonoFijo = _bonoFijo;
    }
}
