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
        char opcion=0;
        Scanner teclado = new Scanner(System.in);
        
          System.out.println("DIGITE EL EJERCISIO A EVALUAR");
            System.out.println("1.EJERCISIO 1");
            System.out.println("2.EJERCISIO 2");
            System.out.println("3.EJERCISIO 3");
            System.out.println("4.EJERCISIO 4");
            System.out.println("5.Salir");

            opcion = (char) teclado.nextInt();
            switch (opcion) {
                case 1:
                    ejercicio1 oejercicio1 = new ejercicio1();
                    for (int i = 0; i < 9; i++) 
                    {
                        System.out.println("DIGITE EL SALARIO DEL TRABAJADOR " + (i + 1));
                        oejercicio1.AgregarSalario(teclado.nextDouble());
                    }
                    System.out.println(oejercicio1.SumaSalarios());
            
                break;
            
        }while(opcion<5);
    }
    
}
