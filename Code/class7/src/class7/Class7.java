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
        System.out.println("3- Ejercicio 3");
        System.out.println("4- Ejercicio 4");
        System.out.println("5- Ejercicio 5");
        System.out.println("6- Ejercicio 6");
        System.out.println("7- Ejercicio 7");
        System.out.println("8- Sair");
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
                    System.out.println(oejercicio2.MediaCadena());
                    System.out.println(oejercicio2.UltimoValor());
                    System.out.println(oejercicio2.Alrevez());
                    
                    System.out.println("¿Desea introducir otra cadena?");
                    r = oScanner.nextLine().charAt(0);
                } while (r == 'S' || r == 's');
            break;

        }
       }while(op<=7);
    }

}
