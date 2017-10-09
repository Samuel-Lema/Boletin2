/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_8;

import java.util.Scanner;

/**
 *
 * @author slemagonzalez
 */
public class Boletin2_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        double n100, n20, n5, n1, suma;
        
        System.out.print("Escribe el nº de billetes de 100:");
        n100 = reader.nextDouble();
        System.out.print("Escribe el nº de billetes de 20:");
        n20 = reader.nextDouble();
        System.out.print("Escribe el nº de billetes de 5:");
        n5 = reader.nextDouble();
        System.out.print("Escribe el nº de monedas de 1:");
        n1 = reader.nextDouble();
        
        suma = (n100 * 100) + (n20 * 20) + (n5 * 5) + (n1 * 1);
        
        System.out.print("En total es: " + suma + " euros.");
    }
    
}
