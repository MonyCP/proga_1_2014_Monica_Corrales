/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicamatriz;

import java.util.Scanner;

/**
 *
 * @author dell 3110
 */
public class ejercicio2 {
   // 2.	Crear una matriz de n * m filas (cargar n y m por teclado) Intercambiar la primer fila con la segundo. Imprimir luego la matriz.
    
    private int [][] matriz;
    private Scanner teclado;
    private int fi;
    private int co;
    
    public void CantidadFC()
    {
        teclado=new Scanner(System.in);
        
        System.out.println("Digite la cantidad de columnas");
        co=teclado.nextInt();
        System.out.println("Digite la cantidad de filas");
        fi=teclado.nextInt();
        matriz =new int [fi][co];
    }
     public void CargarMatriz()
    {
        teclado = new Scanner(System.in);
        
        for (int f=0; f<fi; f++)
        {
            for (int c = 0; c < co; c++) {
                System.out.println("Ingrese el número correspondiente");
                matriz [f][c]=teclado.nextInt();
            }
        
        }
                
    }
    public void IntercambioImprimir() {
        int guardar[] = new int[co];

        for (int i = 0; i < co; i++) {
            guardar[i] = matriz[0][i];
        }
        for (int i = 0; i < co; i++) {
            matriz[0][i] = matriz[1][i];
        }
        for (int i = 0; i < co; i++) {
            matriz[1][i] = guardar[i];
        }
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 5; c++) {
                System.out.print(matriz[f][c] + " ");
            }
            System.out.println();
        }
    }

}
