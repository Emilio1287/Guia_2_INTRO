/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_2_INTRODUCCION;    //<---- Paquete que permite ordenar un cojunto de programas para un determinado FIN.

import java.util.Scanner;

/**
 *
 * @author kuchi
 */
public class Ejercicio_1_SumaDeDosNumeros {  //<----- Programa actual - Nombre de la Clase

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
//<----- "main" Es el primer subprograma dentro del programa "Ejercicio_1_SumaDeDosNumeros" - Lo que ejecute dentro del METODO "mail" (funcion o procedimiento), subprograma dentro de una clase.
    //Escribir un programa que pida dos numeros enteros por teclado y calcule la suma de los dos.
    //El programa debera mostrar el resultado de la suma
    
    Scanner var = new Scanner(System.in);
    
    
    int num1;
   System.out.println("Ingrese un numero");
    num1 = var.nextInt();

    int num2;   
    System.out.println("Ingrese otro numero");
    num2 = var.nextInt();
        
        System.out.println("La suma de "+num1+ " y " +num2+ " es igual a:" +(num1+num2));
        
        
        
        
    
    }
    
}
