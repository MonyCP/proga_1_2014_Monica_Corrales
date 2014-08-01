/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicamatriz2;

import java.util.Scanner;

/**
 *
 * @author dell 3110
 */
public class PracticaMatriz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner teclado = new Scanner (System.in);
       int opcion;
       
       do{
           System.out.println("Digite la opcion que desee ejecutar: "+"\n"+
                   "1.Mostrar el promedio de los datos de la matriz" +"\n"+
                   "2.Imprimir el mator digito imprar de la matriz");
           opcion=teclado.nextInt();
           
           switch(opcion){
               case 1:
                   ejercicio1 e1 = new ejercicio1();
                   System.out.println();
           
           }
           
           
       
       
       }while(opcion<=2);
    
    }
    
}
