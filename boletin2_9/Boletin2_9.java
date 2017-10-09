/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_9;

import java.util.Scanner;

/**
 *
 * @author slemagonzalez
 */
public class Boletin2_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        int b100, b20, b5, b1, dinero;
        
        System.out.print("Escribe el dinero: ");
        dinero = reader.nextInt();
        
        b100 = dinero / 100;
        b20 = (dinero % 100) / 20;
        b5 = ((dinero % 100) % 20) / 5;
        b1 = (((dinero % 100) % 20) % 5) / 1;
        
        System.out.print("El nº de billetes de 100 es:" + b100);
        System.out.print("\r\nEl nº de billetes de 20 es:" + b20);
        System.out.print("\r\nEl nº de billetes de 5 es:" + b5);
        System.out.print("\r\nEscribe el nº de monedas de 1 es :" + b1);
    }
    
}
