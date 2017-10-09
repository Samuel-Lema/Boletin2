/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_3;
import java.util.Scanner;
/**
 *
 * @author slemagonzalez
 */
public class Boletin2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float euros, cambio, dolares;
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Escribe los euros:");
        euros = reader.nextFloat();
        System.out.print("Escribe el cambio:");
        cambio = reader.nextFloat();
        
        dolares = euros * cambio;
        System.out.print(euros + "euros son: " + dolares + " dolares");
    }
    
}
