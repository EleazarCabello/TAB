/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.cap01;
import java.util.Scanner;

public class ParOImpar2 {
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        
        System.out.println("Ingrese un valor: ");
        int v=scanner.nextInt();
        
        // obtenemos el resto de dividir v por 2
        int resto= v % 2;
        
        // utilizando un if in-line
        String mssg = (resto == 0 ) ? "es Par": "es Impar";
        
        // muestro resultado
        System.out.println(v+" "+mssg);
    }
}
