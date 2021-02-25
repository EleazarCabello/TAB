/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.cap02.misclases;

/**
 *
 * @author Eleazar
 */
public class TestFechaDetallada {
    public static void main(String[] args)
    {
        FechaDetallada f=new FechaDetallada();
        f.setDia(25);
        f.setMes(10);
        f.setAnio(2009);

        System.out.println(f);
    }
}
