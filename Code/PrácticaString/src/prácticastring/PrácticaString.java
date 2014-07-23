/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prácticastring;

import java.util.Scanner;

/**
 *
 * @author dell 3110
 */
public class PrácticaString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner oScanner = new Scanner(System.in);
        
        
       System.out.println("Digite el correo a evaluar");
       ejercicio1 oejercicio1 = new ejercicio1();
       oejercicio1.setCadena (oScanner.nextLine());
       System.out.println("La palabra alrevez es: "+oejercicio1.Alrevez());
       
       
       ejercicio2 oejercicio2 = new ejercicio2();
       oejercicio2.setCadena (oScanner.nextLine());
       System.out.println("¿Es palíndromo?: "+oejercicio2.Palindromo());
        
       ejercicio3 oejercicio3 = new ejercicio3();
       oejercicio3.setCadena(oScanner.nextLine());
       System.out.println(oejercicio3.Guion());
    }
    
}
