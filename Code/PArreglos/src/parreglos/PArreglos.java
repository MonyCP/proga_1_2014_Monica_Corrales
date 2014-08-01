/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package parreglos;

import java.util.Scanner;

/**
 *
 * @author dell 3110
 */
public class PArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
                            System.out.println("Digite el valor del vector # "+(i+1));
                            oejercicio1.Agregar(teclado.nextInt());
                    }
                        System.out.println("La suma de los vectores es de "+ oejercicio1.Suma());
                        System.out.println("La suma de los vectores mayores de 36 es "+ oejercicio1.Suma36());
                        System.out.println("La cantidad de elementos mayores a 50 es de "+ oejercicio1.Cantidad50());
                    break;
                case 2:
                        ejercicio2 oejercicio2 = new ejercicio2();
                        for (int i = 0; i < 4; i++) {
                         teclado = new Scanner(System.in);
                            System.out.println("Digite el valor del vector # "+ (i+1));
                            oejercicio2.AgregarVector1(teclado.nextInt());
                        }
                        
                         for (int i = 0; i < 4; i++) {
                         teclado = new Scanner(System.in);
                            System.out.println("Digite el valor del vector # "+ (i+1));
                            oejercicio2.AgregarVector2(teclado.nextInt());
                        }
                        
                       System.out.println(oejercicio2.Imprimir());
                    break;
                case 3:
                     ejercicio3 oejercicio3 = new ejercicio3();
                     for (int i = 0; i < 5; i++) {
                         teclado = new Scanner(System.in);
                         System.out.println("Digite valor del vector 1 # " +(i+1) );
                         oejercicio3.AgregarVector1(teclado.nextInt());
                    }
                       for (int i = 0; i < 5; i++) {
                         teclado = new Scanner(System.in);
                         System.out.println("Digite valor del vector 1 # " +(i+1) );
                         oejercicio3.AgregarVector1(teclado.nextInt());
                    }
                       System.out.println(oejercicio3.PromedioMayor());
                    break;
                case 4:
                    
                    break;

            }
        } while (opcion < 5);
    }
}

