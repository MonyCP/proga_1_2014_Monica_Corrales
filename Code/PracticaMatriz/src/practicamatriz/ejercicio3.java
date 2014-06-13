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
public class ejercicio3 {
    //3.	Crear una matriz de n * m filas (cargar n y m por teclado) Imprimir los cuatro valores que se encuentran en los vértices de la misma (matriz [0] [0] etc.)
    
    private int matriz [] [];
    private int co;
    private int fi;
    private Scanner teclado;

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
     
 public void imprimirEsquinas() {
    	
        System.out.println("Esquina superior izquierdo:");
        System.out.println(matriz[0][0]);
    	
        System.out.println("Esquina superior derecho:");        
        System.out.println(matriz[0][matriz[0].length-1]);
    	
        System.out.println("Esquina inferior izquierdo:");        
        System.out.println(matriz[matriz.length-1][0]);
    	
        System.out.println("Esquina inferior derecho:");        
        System.out.println(matriz[matriz.length-1][matriz[matriz.length-1].length-1]);
    }    

}
