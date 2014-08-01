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
public class ejercicio6 {

    private int [][] matriz;
    private Scanner teclado;

    private int fi;
    private int co;
    
     public void CantidadFC()
    {
        teclado=new Scanner(System.in);
        System.out.println("Digite la cantidad de columnas que desea");
        co=teclado.nextInt();
        System.out.println("Digite la cantidad de filas que desea");
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
      public void imprimirOrdenarFila(int t[][]){
        int aux = 0, col;
 
        System.out.println("¿Qué fila quieres ordenar?: ");
        col = teclado.nextInt();
 
        for (int k = 0; k < t.length; k++) {
            for (int i = 0; i < t.length-1; i++) {
                for (int j = 0; j < t.length-1-i; j++) {
                    if (t[i][col] > t[i+1][col]){
                        for (int l = 0; l < t.length; l++) {
                            aux = t[i][l];
                            t[i][l] = t[i+1][l];
                            t[i+1][l] = aux;
                        }
                    }
                }
            }
        }
        
    }
 
    }

