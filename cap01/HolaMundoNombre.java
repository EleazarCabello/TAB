/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.cap01;

/**
 *
 * @author Eleazar
 */
import java.util.Scanner;
public class HolaMundoNombre 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

	System.out.println("Ingrese nombre edad altura: ");

	String nom = scanner.next();
	int edad = scanner.nextInt();
	double altura = scanner.nextDouble();

	System.out.println("Nombre: "+nom+"Edad: "+edad+"Altura: "+altura); 
    }
}
