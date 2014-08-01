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
public class ejercicio4 {

    private int[][] matriz;
    private Scanner teclado;

    private int fi;
    private int co;

    public void CantidadFC() {
        teclado = new Scanner(System.in);
        System.out.println("Digite la cantidad de columnas que desea");
        co = teclado.nextInt();
        System.out.println("Digite la cantidad de filas que desea");
        fi = teclado.nextInt();
        matriz = new int[fi][co];
    }

    public void CargarMatriz() {
        teclado = new Scanner(System.in);

        for (int f = 0; f < fi; f++) {
            for (int c = 0; c < co; c++) {
                System.out.println("Ingrese el número correspondiente");
                matriz[f][c] = teclado.nextInt();
            }

        }

    }

    public void PorcentajeImpares() {
        int impares = 0;
        int filas = 0;
        int columnas = 0;

        for (int c = 0; c < 5; c++) {
            for (int f = 0; f < 2; f++) {
                if (matriz[f][c] % 2 != 0) {
                    impares += matriz[f][c];
                    filas++;
                    columnas++;
                }
                impares = (impares * 100) / (filas * columnas);
                System.out.println("El promedio de los números pares es " + impares);
            }
        }
    }
}
      
