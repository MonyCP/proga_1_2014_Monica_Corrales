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
        String texto = "La ancianita se enfermó, pq la ancianita comio algo muy raro.";

        String palabra = "ancianita";
        String resultado = "";
        /*--------------------------------------------------------------------*/
        System.out.println("Ejercicio 1: Rotar Palabra");
        //Rotar palabra
        resultado = "";
        
        
        for (int i = palabra.length() -1; i >= 0 ; i--) {
            
            resultado += palabra.charAt(i);
        }
        
        System.out.println(resultado);
        
        /*--------------------------------------------------------------------*/
        System.out.println("Ejercicio 2: Palindromo");
        //Convertir en palindromo
        resultado = "";
        for (int i = palabra.length() - 2; i >= 0 ; i--) {
            
            resultado += palabra.charAt(i);
        }
        
        System.out.println(palabra + resultado);
        
        /*--------------------------------------------------------------------*/
        System.out.println("Ejercicio 3 y 4:Agregar comillas y contador de apariciones");
        //agregar comilla en la palabra Ancianita
        
        resultado = "";
        int contador = 0;

        while (texto.indexOf(palabra) > -1)
        {
            resultado += texto.substring(0, texto.indexOf(palabra));
            resultado += "'";
            resultado += palabra;
            resultado += "'";
            texto = texto.substring(texto.indexOf(palabra) + palabra.length());
            
            //Cuenta la cantidad de aparicione de la palabra en el texto
            contador++;
        }
        resultado += texto;
        System.out.println(resultado);
        System.out.println(palabra + " aparce: " + contador + " veces en el texto.");
        
        ejercicio1 prueba = new ejercicio1();
        
        System.out.println(prueba.subString("Texto de Prueba", 5, 14));
        
        System.out.println(prueba.IndexOf("Texto de Prueba", "de", 2));
        
    }
    
    
}
