/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_2_INTRODUCCION;

import java.util.Scanner;

/**
 *
 * @author kuchi
 */
public class Ejercicio_3_MaxMin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        /*Escribir un programa que pida una frase 
        y la muestre toda en mayúsculas
        y después toda en minúsculas.*/
        
        
        System.out.println("Por favor ingrese una frase");
        
        String Frase = leer.next();
       
         System.out.println(Frase.toUpperCase() +"(En Mayuscula)");
         System.out.println(Frase.toLowerCase() +"(En Minuscula)");
        
        
        
        
        
        
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}
