/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_1;

import java.util.Scanner;

/**
 *
 * @author kuchi
 */
public class Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner (System.in);
        
        /* Escribir un programa que 
lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada 
        de ese número */
       
        System.out.println("Por Favor ingrese un numero ENTERO");
        
        int Entero = Leer.nextInt(); /* int= se usa para numeros enteros*/
        System.out.println("El doble es " +(Entero*2));
        System.out.println("El triple es " +(Entero*3));
        System.out.println("La potencia al cuadrado es " +(Entero*Entero));
        System.out.println("La raiz es " + Math.sqrt(Entero));
    }
}
