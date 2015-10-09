package Logica;

/**
 *
 * @author gusta
 */
public class Participantes {

    private String numInsc;
    private String nombre;
    private float calificacion;
    private String cancion;

    public Participantes(String numInsc, String nombre, float calificacion, String cancion) {
        this.numInsc = numInsc;
        this.nombre = nombre;
        this.calificacion = calificacion;
        this.cancion = cancion;
    }

    public void setCancion(String cancion) {
        this.cancion = cancion;
    }

    public String getCancion() {
        return cancion;
    }

    public String getNumInsc() {
        return numInsc;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }
    
    
    

}
