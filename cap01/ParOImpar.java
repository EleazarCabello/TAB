/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.cap01;
import java.util.Scanner;

 public class ParOImpar 
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese un valor: ");
        
        int v = scanner.nextInt();
        
        // obtenemos el resto de dividir v por 2
        int resto = v % 2;
        
        // para preguntar por igual utilizamos ==
        if( resto == 0 )
        {
            System.out.println(v+" es Par");
        }
        else
        {
            System.out.println(v+" es Impar");
        }
    }
}
