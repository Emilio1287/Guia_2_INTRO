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
public class Ejercicio_4_PasajeGradosCgdosaFhit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*Dada una cantidad de grados centígrados 
        se debe mostrar su
        equivalente en grados Fahrenheit. 
        La fórmula correspondiente es: 
        F = 32 + (9 * C / 5).*/
        
        Scanner Leer = new Scanner (System.in);
        
        
        System.out.println("Ingrese una temperatura de grados centigrados");
      double grados = Leer.nextInt(); //double (para que el numero que ingreswe pueda tener comas   
        System.out.println("Representan " +(32+ (9* grados/5))+" Fahrenheit.");
        
        
        
        
        
        
    
        // TODO code application logic here
    }
    
}
