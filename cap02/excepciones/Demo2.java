
package Libro.cap02.excepciones;


public class Demo2 {
    public static void main(String[] args) throws Exception
    {
        try
        {
            int i = Integer.parseInt("no es una cadena numerica...");
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
           System.out.println("Entre al catch...");
        }
        finally
        {
            System.out.println("Esto sale siempre !");
        }
    }
}
