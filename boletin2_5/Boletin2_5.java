/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_5;
import java.util.Scanner;

/**
 *
 * @author slemagonzalez
 */
public class Boletin2_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner reader = new Scanner(System.in);
        double milla, metros;
        
        System.out.print("Escribe las millas:");
        milla = reader.nextDouble();
        
        metros = milla * 1852;
        
        System.out.print(Math.round(milla) + " millas son: " + metros + " metros.");
    }
    
}
