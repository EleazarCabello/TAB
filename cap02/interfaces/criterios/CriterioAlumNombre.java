
package Libro.cap02.interfaces.criterios;
import Libro.cap02.interfaces.Alumno;

// heredo de Criterio especializando en Alumno
public class CriterioAlumNombre extends Criterio<Alumno>
{
    public int comparar(Alumno a, Alumno b)
    {
        return a.getnombre().compareTo(b.getnombre());
    }
}
