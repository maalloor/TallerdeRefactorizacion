package modelos;


public class Paralelo {
    private int numero;
    private Materia materia;
    private Profesor profesor;
    private Ayudante ayudante;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    
    //Imprime el listado de estudiantes registrados
    public void mostrarListado(){
        //No es necesario implementar
    }
    
    public double getNotaInicial(){
        return materia.getNotaInicial();
    }
    
    public double getNotaFinal(){
        return materia.getNotaFinal();
    }
}
