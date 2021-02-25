/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.cap01.Cadenas;
import java.util.Scanner;

public class Cadenas6 {
     public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese un valor entero: ");
        int v = scanner.nextInt();
        
        System.out.println("Valor Ingresado: "+v);
        System.out.println("binario = "+Integer.toBinaryString(v));
        System.out.println("octal = "+Integer.toOctalString(v));
        System.out.println("hexadecimal = "+Integer.toHexString(v));
        
        System.out.print("Ingrese una base numerica: ");
        int b = scanner.nextInt();
        
        String sBaseN=Integer.toString(v,b);
        System.out.println(v + " en base("+b+") = " + sBaseN);
    }
}
