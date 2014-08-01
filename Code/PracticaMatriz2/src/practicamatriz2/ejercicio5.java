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
public class ejercicio5 {

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

    public void Ordenar() {

        int[] filas = new int[co];
        
        for (int f = 0; f < fi; f++) {
                filas = matriz[f];
                //Usamos un bucle anidado
                for (int i = 0; i < (filas.length - 1); i++) {
                    for (int j = i + 1; j < filas.length; j++) {
                        if (filas[i] > filas[j]) {
                            //Intercambiamos valores
                            int variableauxiliar = filas[i];
                            filas[i] = filas[j];
                            filas[j] = variableauxiliar;
                        }

                    }

                }
            }
        }
    }

