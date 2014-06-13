/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aliadosenemigos;

import java.util.Scanner;

/**
 *
 * @author dell 3110
 */
public class proyecto {
    private String username [] = new String [2];
    private boolean jugadores []= new boolean [2];
    private int [][] tablero1;
    private int [][] tablero2;
    private Scanner teclado;
    
    public void Nombres() {

        teclado = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.println("Digite el nombre del jugador");
            username[i] = teclado.next();
        }
    }
    
     public void CantidadFC()
    {
        teclado=new Scanner(System.in);
        int c;
        int f;
        System.out.println("Digite el largo del tablero");
        c=teclado.nextInt();
        System.out.println("Digite el anchon del tablero ");
        f=teclado.nextInt();
        tablero1 =new int [f][c];
        tablero2=tablero1;
    }
    public void Asignacion()
    {   //false=jugador1 true=jugador2.
        boolean estado = false;
        if (estado==false )
        {
                            
            
        }
    }
     
     public void turnos()
     {
         boolean estado;
         if(estado==true)
         System.out.println("Digite las coordenadas");
         matriz 
     }
}
