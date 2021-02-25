/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap02.figuras;


public class TestAreaPromedio {
     public static void main(String[] args)
     {
         FiguraGeometrica arr[] = { new Circulo(23)
                                    , new Rectangulo(12,4)
                                    , new Triangulo(2,5) };
         
         double prom = FiguraGeometrica.areaPromedio(arr);
         
         System.out.println("Promedio = " + prom);
     }
}
