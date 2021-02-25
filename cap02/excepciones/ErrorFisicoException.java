
package Libro.cap02.excepciones;

@SuppressWarnings("serial")
public class ErrorFisicoException extends Exception
{
    public ErrorFisicoException(Exception ex)
    {
        super("Ocurrio un Error Fisico", ex);
    }
}
