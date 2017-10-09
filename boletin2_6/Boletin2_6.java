/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_6;

import java.util.Scanner;

/**
 *
 * @author slemagonzalez
 */
public class Boletin2_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner reader = new Scanner(System.in);
        double pT, pP, descuento;
        
        System.out.print("Escribe el precio total:");
        pT = reader.nextDouble();
        System.out.print("Escribe el precio pagado:");
        pP = reader.nextDouble();
        
        descuento = 100 - ((pP * 100) / pT);
        
        System.out.print("El porcentaje del descuento es: " + descuento + " %");
    }
    
}
