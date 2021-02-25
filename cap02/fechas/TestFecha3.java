/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.cap02.fechas;
import java.util.Scanner;

public class TestFecha3 {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        
        // el usuario ingresa los los datos de la fecha
        System.out.println("Ingrese Fecha1 (dia, mes y anio): ");
        int dia = scanner.nextInt(); 
        int mes = scanner.nextInt(); 
        int anio = scanner.nextInt();
        
        // creo un objeto de la clase Fecha
        Fecha f1 = new Fecha(dia,mes,anio);
        
        // el usuario ingresa los los datos de la fecha
        System.out.print("Ingrese Fecha2 (dia, mes y anio): ");
        dia = scanner.nextInt();
        mes = scanner.nextInt();
        anio = scanner.nextInt();
        
        // creo un objeto de la clase Fecha
        Fecha f2=new Fecha(dia,mes,anio);
        
        System.out.println("Fecha 1 = "+f1);
        System.out.println("Fecha 2 = "+f2);
        
        if( f1.equals(f2) )
        {
            System.out.println("Son iguales !");
        }
        else
        {
            System.out.println("Son distintas...");
        }
    }    
}
