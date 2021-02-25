/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.cap01.Cadenas;


public class Cadenas {
    public static void main(String[] args)
    {
        String s = "Esta es mi cadena";
        
        System.out.println( s.charAt(0) );
        System.out.println( s.charAt(5) );
        System.out.println( s.charAt(s.length()-1) );
        
        char c;
        for(int i=0; i<s.length(); i++)
        {
            c = s.charAt(i);
            System.out.println(i+" -> "+c);
        }
    }
}
