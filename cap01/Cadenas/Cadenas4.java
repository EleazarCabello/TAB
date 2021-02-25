/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.cap01.Cadenas;


public class Cadenas4 {
    public static void main(String[] args)
    {
        String s = "Un buen libro de Java";
        
        boolean b1 = s.startsWith("Un buen"); // true
        boolean b2 = s.startsWith("A"); // false
        boolean b3 = s.endsWith("Java"); // true
        boolean b4 = s.endsWith("Chau"); // false
        
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
    }
}
