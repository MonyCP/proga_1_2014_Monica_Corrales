/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicaarreglos;

import java.util.Scanner;

/**
 *
 * @author dell 3110
 */
public class PracticaArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main() {
        // TODO code application logic here
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Digite la opcion del ejercicio a evaluar");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. Ejercicio 4");
            System.out.println("5. Salir");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    ejercicio1 oejercicio1 = new ejercicio1();

                    for (int i = 0; i < 8; i++) {
                        teclado = new Scanner(System.in);
                        System.out.println("Digite valor # " + (i + 1));
                        oejercicio1.Agregar(teclado.nextInt());
                    }
                    System.out.println("La sumatoria del vector es " + oejercicio1.Suma());
                    System.out.println("La sumatoria del vector mayor a 36 es " + oejercicio1.Suma36());
                    System.out.println("La cantidad de elementos del vector mayores a 50 es " + oejercicio1.Cantidad50());
                    break;
                case 2:
                        ejercicio2 oejercicio2=new ejercicio2();
                    
                    for (int i = 0; i < 4; i++) {
                        teclado= new Scanner(System.in);
                        System.out.println("Digite valor del vector 1 # " +(i+1) );
                        oejercicio2.AgregarVector1(teclado.nextInt());
                    }
                    for (int i = 0; i < 4; i++) {
                        teclado= new Scanner(System.in);
                        System.out.println("Digite valor del vector 2 # " +(i+1) );
                        oejercicio2.AgregarVector2(teclado.nextInt());
                    }
                    oejercicio2.SumaVectores();
                    System.out.println("La sumatoria es : "+oejercicio2.Imprimir());  
                    break;


            }
        } while (opcion < 5);
    }
}
