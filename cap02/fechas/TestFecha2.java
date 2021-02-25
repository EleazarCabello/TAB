/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.cap02.fechas;


public class TestFecha2 {
    public static void main(String[] args)
    {
        // definimos el objeto f (pero no lo creamos)
        Fecha f = new Fecha();
        f.setDia(2); // aqui tira un error y finaliza el programa
        f.setMes(10); // no se llega a ejecutar
        f.setAnio(1970); // no se llega a ejecutar
        
        System.out.println(f); // no se llega a ejecutar
    }
}    