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
public class ejercicio1 {
    private int [][] matriz;
    private Scanner teclado;
    
    private int fi;
    private int co;
    
 
    /*public void CargarMatriz()
    {
        matriz =new int [9][9];

       for (int c = 0; c < 9; c++) 
        {
            for (int f=0; f<9; f++) {
                matriz [f][c]=;

                }
            }
        
        }
                
    }*/
    
    public void CargarMatriz(){
    matriz = new int [3][3];
    matriz [0][0]=1; matriz [0][2]=3; matriz [1][1]=5; matriz [2][0]=7; 
                                       matriz [2][1]=8; matriz [2][2]=9; 
    matriz [0][1]=2; matriz [1][0]=4; matriz [1][2]=6;
    }
    
    public void Imprimir() {
        int promedio = 0;

        for (int c = 0; c < 9; c++) {
            for (int f = 0; f < 9; f++) {
                promedio = matriz[f][c] + promedio;
            }
          
        }
                  promedio = promedio / (co * fi);
                 System.out.println("El promedio de la matriz es: "+ promedio);

    }
}
    

