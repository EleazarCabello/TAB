/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.cap01.Cadenas;


public class Cadenas5 {
    public static void main(String[] args)
    {
        String s = "Un buen libro de Java, un buen material";
        
        int pos1 = s.indexOf("buen"); // retorna 3
        int pos2 = s.lastIndexOf("buen"); // returna 26
        System.out.println(pos1);
        System.out.println(pos2);
    }
}
