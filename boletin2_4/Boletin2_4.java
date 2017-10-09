/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_4;
import java.util.Scanner;

/**
 *
 * @author slemagonzalez
 */
public class Boletin2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double n1, n2, suma, resta, producto, division;
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Escribe el número 1:");
        n1 = reader.nextDouble();
        System.out.print("Escribe el número 2:");
        n2 = reader.nextDouble();
        
        suma = n1 + n2;
        resta = n1 - n2;
        producto = n1 * n2;
        division = n1 / n2;
        
        System.out.print("La suma es: " + suma + "\r\nla resta es: " + resta + "\r\nel producto es es: " + producto + "\r\nla division es: " + division);
    }
    
}
