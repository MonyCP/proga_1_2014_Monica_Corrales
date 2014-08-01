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
    private boolean jugadores = true;
    private int tablero1[][];
    private int [][] tablero2;
    private int barcos=0;
    
    private Scanner teclado;
    
    
    public void Nombres() {

        teclado = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.println("Digite el nombre del jugador");
            username[i] = teclado.next();
        }
    }
    
    public void CantidadFC() {
        teclado = new Scanner(System.in);
        int c;
        int f;
        int l;
        int a;
        int cont = 0;
        double promedio=0;
        double pro=0;
        do {
            if (jugadores == true) {
                System.out.println("Digite el largo del tablero");
                l = teclado.nextInt();
                System.out.println("Digite el anchon del tablero ");
                a = teclado.nextInt();
                jugadores = false;
                tablero1 = new int[f][c];
                cont++;
                promedio= promedio+c;
                pro=pro+f;
                
            } else {
                System.out.println("Digite el largo del tablero");
                c = teclado.nextInt();
                System.out.println("Digite el anchon del tablero ");
                f = teclado.nextInt();
                jugadores = false;
                tablero2 = new int[f][c];
                cont++;
                
            }
            
        } while (cont == 2);
      //promedio (pedir dos veces)
    }
    
    public void ValorTablero()
    {
        for (int i = 0; i < 10; i++) {
            
        }
    }

    public void Asignacion()
    {   //true=jugador1 false=jugador2.
        int cont=0;
        int vertical;
        int horizontal;
       do{
        if (jugadores==true )
        {   cont=1;
            do{
            System.out.println("Digite las coordenadas en las que desea colocar su barco # " + cont);
                System.out.println("Linea vertical");
                vertical=teclado.nextInt();
                System.out.println("Linea horizontal");
                horizontal=teclado.nextInt();
               
                //Verifica que no sé repitan las coordenadas
                if(tablero1[horizontal][vertical]==1)
                {
                    System.out.println("Estas coordenas ya poseen un barco");
                    cont--;
                }
                else
                {
                    System.out.println("Barco en posición");
                    tablero1[horizontal][vertical]=1;
                    cont++;
                }
            }while(cont==barcos);
            jugadores=false;        
        }
        else
        { cont=1;
            do{
            System.out.println("Digite las coordenadas en las que desea colocar su barco # " + cont);
                System.out.println("Linea vertical");
                vertical=teclado.nextInt();
                System.out.println("Linea horizontal");
                horizontal=teclado.nextInt();
               
                //Verifica que no sé repitan las coordenadas
                if(tablero2[horizontal][vertical]==1)
                {
                    System.out.println("Estas coordenas ya poseen un barco");
                    cont--;
                }
                else
                {
                    System.out.println("Barco en posición");
                    tablero2[horizontal][vertical]=1;
                    cont++;
                }
            }while(cont==barcos);  
            jugadores=true;
        }
       }while(cont==2);
    }
     
}
