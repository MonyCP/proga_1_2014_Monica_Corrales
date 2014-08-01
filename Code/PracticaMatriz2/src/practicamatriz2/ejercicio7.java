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
public class ejercicio7 {
    public class ejercici2 {
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
        public void MayorFila() {
            int mayor = matriz[0][0];

            for (int f = 0; f < matriz.length; f++) {
                for (int c = 0; c < matriz[f].length; c++) {
                    if ((matriz[f][c] > mayor)) {
                        mayor = matriz[f][c];
                    }
                }
                System.out.println("E mayor elemento de la fila " + f + "es: " + mayor);
                mayor = 0;
            }

        }

    }
}