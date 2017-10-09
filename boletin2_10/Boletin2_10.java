/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_10;

import java.util.Scanner;

/**
 *
 * @author slemagonzalez
 */
public class Boletin2_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        int saldoL, saldoB, saldo, comision, kilometros, comida;
        
        System.out.print("Escribe el saldo: ");
        saldo = reader.nextInt();
        System.out.print("Escribe las ventas: ");
        comision = reader.nextInt();
        System.out.print("Escribe los kilometros: ");
        kilometros = reader.nextInt();
        System.out.print("Escribe las comidas: ");
        comida = reader.nextInt();
        
        saldoB = saldo + (comision * 5 / 100) +  (kilometros * 2) + (comida * 30);
        saldoL = saldoB - (saldoB * 18 / 100) - 36;
        
        System.out.print("El sueldo liquido es: " + saldoL);
        
    }
    
}
