
package Libro.Cap02.instancias;
import Libro.cap02.fechas.Fecha;
import Libro.cap02.misclases.FechaDetallada;

public class Persona {
    private String nombre;         // atribto
    private String dni;            // atribto
    private Fecha fechaNacimiento; // atribto

    private int cont = 0; // variable de estado
    
    public Persona(String nombre, String dni, Fecha fecNac)
    {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNacimiento = fecNac;
    }
    
    public String toString()
    {
        cont++;
        
        return nombre + ", DNI: " + dni
                      + ", nacido el: " + fechaNacimiento
                      + " (" + cont + ")";
    }
    
    //getters y setters
    public String getnombre()
    {
        return nombre;
    }
    public void setnombre(String nombre)
    {
        this.nombre = nombre;
    }
    
      public String getdni()
    {
        return dni;
    }
    public void setdni(String dni)
    {
        this.dni = dni;
    }
    
}
