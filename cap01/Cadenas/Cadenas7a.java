/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.cap01.Cadenas;


public class Cadenas7a {
    public static void main(String[] args)
    {
        String s = "Juan|Marcos|Carlos|Matias";
        String[] tokens = s.split("[|]");
        
        for(int i=0; i<tokens.length; i++)
        {
            System.out.println(tokens[i]);
        }
    }
}
