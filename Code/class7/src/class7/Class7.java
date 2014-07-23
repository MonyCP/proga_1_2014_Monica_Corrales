/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package class7;

import java.util.Scanner;

/**
 *
 * @author dell 3110
 */
public class Class7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int op;
        Scanner oScanner = new Scanner(System.in);
        char r;
       do{
        System.err.println("Digite la opción que desea");
        System.out.println("1- Ejercicio 1");
        System.out.println("2- Ejercicio 2");
        System.out.println("3- Salida 4");
        op = Integer.parseInt(oScanner.nextLine());
        switch (op) {
            case 1:

                do {
                    System.out.println("Digite el correo a evaluar");
                    ejercicio1 oejercicio1 = new ejercicio1(oScanner.nextLine());
                    System.out.println(oejercicio1.ValidarCorreo());

                    System.out.println("¿Desea introducir otro correo?");
                    r = oScanner.nextLine().charAt(0);
                } while (r == 'S' || r == 's');
            break;
            case 2:
                do {
                    System.out.println("Digite la cadena a evaluar");
                    ejercicio2 oejercicio2 = new ejercicio2();
                    oejercicio2.setCadena (oScanner.nextLine());
                    System.out.println("La mitad de la palabra es "+oejercicio2.MediaCadena());
                    System.out.println("El último valor es "+oejercicio2.UltimoValor());
                    System.out.println("La palabra alrevez es "+oejercicio2.Alrevez());
                    System.out.println("La palabra dividida en guiones: "+oejercicio2.Guion()); 
                    System.out.println("La cantidad de vocales son: "+oejercicio2.Vocales());
                    System.out.println("Su palabra es "+oejercicio2.Palindromo()+" palíndromo");
                    
                    
                    System.out.println("¿Desea introducir otra cadena?");
                    r = oScanner.nextLine().charAt(0);
                } while (r == 'S' || r == 's');
            break;

        }
       }while(op<=7);
    }

}
