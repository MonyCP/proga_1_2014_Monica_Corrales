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
        
       Scanner teclado = new Scanner(System.in);
        ejercicio1 e = new ejercicio1();
        
        System.out.println("Digite la cadena a evaluar");
        e.setCadena(teclado.nextLine());
        
        System.out.println("Cadena al revez.");
        System.out.println(e.alRevez());
        
        System.out.println("Palindromo.");
        System.out.println(e.palindromo1());
        
        System.out.println("Digite un texto para buscar la cadena que se digitó anteriormente. (Será marcada por un -)");
        e.setTexto(teclado.nextLine());
        System.out.println(e.buscaPalabra());
        
    }

}
