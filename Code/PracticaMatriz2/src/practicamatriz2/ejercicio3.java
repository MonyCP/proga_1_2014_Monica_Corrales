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
public class ejercicio3 {

    private int[][] matriz;
    private Scanner teclado;

    private int fi;
    private int co;

    public void CantidadFC() {
        teclado = new Scanner(System.in);

        System.out.println("Digite la cantidad de columnas");
        co = teclado.nextInt();
        System.out.println("Digite la cantidad de filas");
        fi = teclado.nextInt();
        matriz = new int[fi][co];
    }

    public void CargarMatriz() {
        teclado = new Scanner(System.in);
        matriz = new int[fi][co];

        for (int c = 0; c < 5; c++) {
            for (int f = 0; f < 2; f++) {
                System.out.println("Ingrese el número correspondiente");
                matriz[f][c] = teclado.nextInt();
            }

        }

    }

    public void ImprimirPromedioPares() {
        int promedio = 0;
        int filas=0;
        int columnas=0;

        for (int c = 0; c < 5; c++) {
            for (int f = 0; f < 2; f++) {
                if (matriz[f][c] % 2 == 0) {
                    promedio += matriz[f][c];
                    filas++;
                    columnas++;
                }
                promedio = promedio / (filas * columnas);
                System.out.println("El promedio de los números pares es " + promedio);
            }

        }

    }
}
