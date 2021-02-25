
package Libro.cap02.colecciones;
import java.util.Vector;
import java.util.Collection;

public class TestVector {
    public static void main(String[] args)
    {
        // instancio un Vector especializado en String
        Vector<String> v = new Vector<String>();
        
        // le asigno algunos valores
        v.add("Pablo");
        v.add("Juan");
        v.add("Carlos");
        
        String aux;
        
        // el metodo size indica cuantos elementos contiene el vector
        for(int i=0; i<v.size(); i++ )
        {
            // el metodo get retorna el i-esimo elemento
            aux = v.get(i);
            System.out.println(aux);
        }
        
        // el metodo obtenerLista retorna una Collection
        Collection<String> coll = UNombres.obtenerLista();
        
        // itero la coleccion de nombres y muestro cada elemento
        for(String nom: coll)
        {
            System.out.println(nom);
        }
    }   
}
