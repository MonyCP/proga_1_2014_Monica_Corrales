/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicaswitch;

import java.util.Scanner;

/**
 *
 * @author dell 3110
 */
public class PracticaSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        { int opcion;
        
        System.out.println("Digite un número del 1 al 12");
        opcion=Integer.parseInt(teclado.nextLine());
        
        switch (opcion)
        {
            case 1:
                System.out.println("Enero");
            break;
            case 2:
                System.out.println("Febreo");
            break;
            case 3:
                System.out.println("Marzo");
            break;
            case 4:
                System.out.println("Abril");
            break;
            case 5:
                System.out.println("Mayo");
            break;
            case 6:
                System.out.println("Junio");
            break;
            case 7:
                System.out.println("Julio");
            break;
            case 8:
                System.out.println("Agosto");
            break;
            case 9:
                System.out.println("Septiembre");
            break;
            case 10:
                System.out.println("Octubre");
            break;
            case 11:
                System.out.println("Noviembre");
            break;
            case 12:
                System.out.println("Diciembre");
            break;
        }
    }
    { 
            int opcion;
            int número;
            double resul;
            System.out.println("Ingrese un número entero");
            número = Integer.parseInt(teclado.nextLine());
            operaciones ope = new operaciones();

            if (número <= 0) {
                System.out.println("Error");
            } else {
                if ((número % 10 == 2) || (número % 10 == 5) || (número % 10 == 5)) {
                    opcion = 1;
                }
                if ((número % 10 == 4) || (número % 10 == 7) || (número % 10 == 9)) {
                    opcion = 2;
                } else {
                    opcion = 3;
                }
                switch (opcion) {
                    case 1:  
                        resul=ope.cuadrado(número);
                        System.out.println("El cuadrado del "+ número+ " es " + resul );
                    break;
                    case 2:
                        resul=ope.multiplicacion(número);
                        System.out.println("El producto es de " + resul);
                    break;
                    case 3:
                        resul=número;
                        System.out.println("El número es "+ resul);
                    break;
                }
            }
        }
    {
     char op;
     int caso = 0;
     char r;
     do{
        System.out.println("Ingrese un letra entre A y E");
        op=teclado.nextLine().charAt(0);
        
        if((op=='a')||(op=='A'))
        {caso=1;}
        if((op=='b')||(op=='B'))
        {caso=2;}
        if((op=='c')||(op=='C'))
        {caso=3;}
        if((op=='d')||(op=='D'))
        {caso=4;}
        if((op=='e')||(op=='E'))
        {caso=5;}
        
        switch (caso)
        {
         case 1:
             System.out.println("Excelente");
         break;
         case 2:
             System.out.println("Bueno");
         break;
         case 3:
             System.out.println("Regular");
         break;
         case 4:
             System.out.println("Malo");
         break;
         case 5:
             System.out.println("Pésimo");
         break;
        }
         System.out.println("¿Desea continuar?");
         r=teclado.nextLine().charAt(0);
     }while ((r=='s')||(r=='S'));  
    }
        {
            int mes;
            int año;
            int M;
            char r;
            Fecha fec = new Fecha();
            do {
                System.out.println("Digite año y el número de mes");
                año = Integer.parseInt(teclado.nextLine());
                mes = Integer.parseInt(teclado.nextLine());
                M = fec.opera(año, mes);

                switch (M) {
                    case 1:
                        System.out.println("Son 29");
                        break;
                    case 2:
                        System.out.println("Son 28 dias");
                        break;
                    case 3:
                        System.out.println("Son 31 días");
                        break;
                    case 4:
                        System.out.println("Son 30 días");
                        break;
                }
                System.out.println("¿Desea continuar?");
                r = teclado.nextLine().charAt(0);
            } while (r == 's' || r == 'S');

        }
    { 
        int num;
        String resul = "";
        char r;
        Romanos Roma = new Romanos();

        do {
            System.out.println("Digite un número del 1 al 3000");
            num = Integer.parseInt(teclado.nextLine());
            resul = Roma.Romanos(num);
            System.out.println(resul);

            System.out.println("¿Desea introducir otro número?");
            r = teclado.nextLine().charAt(0);
        } while (r == 's' || r == 'S');

    }
    {
       int dia;
       int mes;
       int año;
        
        System.out.println("Didite el número del día");
        dia=Integer.parseInt(teclado.nextLine());
        System.out.println("Digite el número del mes");
        mes=Integer.parseInt(teclado.nextLine());
        System.out.println("Digite el año");
        año=Integer.parseInt(teclado.nextLine());
        
        switch (mes)
        {   case 1:
              if(dia==1)
              {
                 año--;
                 mes=12;
                 dia=30;
                  System.out.println("El día anterior es "+dia+mes+año);
              }else{
                       dia--;
                       System.out.println("El día anterior es "+dia+mes+año);
                  }
            break;
            case 2:
            case 4:
            case 6:
            case 8:
            case 9:
            case 11:
                if(dia==1)
              {
                 mes--;
                 dia=31;
                 System.out.println("El día anterior es "+dia+mes+año);
              }else{
                 dia--;
                 System.out.println("El día anterior es "+dia+mes+año);
                  }
            break;
            case 3:
                 if(dia==1)
                  {
                 if(año % 4 == 0 && año % 100 != 0  || año % 400 == 0)
                    {dia=29;
                     mes--;
                     System.out.println("El día anterior es "+dia+mes+año);  }
                 else
                    {dia=28;
                     mes--;
                     System.out.println("El día anterior es "+dia+mes+año);}
                  }
            break;
            case 5:
            case 7:
            case 10:
            case 12:
                  if(dia==1)
              {
                 mes--;
                 dia=30;
                 System.out.println("El día anterior es "+dia+mes+año);
              }else{
                 dia--;
                 System.out.println("El día anterior es "+dia+mes+año);
                  }
            break;
                
              }
        }  
        {
            int diaMes;
            System.out.println("Digite el día");
            diaMes=Integer.parseInt(teclado.nextLine());
            if (diaMes > 7) {
            diaMes = diaMes % 7;
        }

        switch (diaMes) {
            case 1:
                System.out.println("Lunes.");
                break;
            case 2:
                System.out.println("Martes.");
                break;
            case 3:
                System.out.println("Miércoles.");
                break;
            case 4:
                System.out.println("Jueves.");
                break;
            case 5:
                System.out.println("Viernes.");
                break;
            case 6:
                System.out.println("Sábado.");
                break;
            case 7:
                System.out.println("Domingo.");
                break;
        }

    }
                    char d;
                    int dia;
                    int f = 0;
                    System.out.println("Digite el dia 1");
                    d = teclado.nextLine().charAt(0);
                     {
                        if (d == 'L' || d == 'l') {
                            f = 0;
                        }

                        if (d == 'K' || d == 'k') {
                            f = 1;
                        }

                        if (d == 'M' || d == 'm') {
                            f = 2;
                        }

                        if (d == 'J' || d == 'j') {
                            f = 3;
                        }

                        if (d == 'V' || d == 'v') {
                            f = 4;
                        }

                        if (d == 'S' || d == 's') {
                            f = 5;
                        }

                        if (d == 'D' || d == 'd') {
                            f = 6;
                        }
                    }
                    System.out.println("Digite el numero de dia que es hoy");
                    dia = Integer.parseInt(teclado.nextLine());
                    dia = dia + f;
                    if (dia % 7 == 0) {
                        System.out.println("Domingo");
                    } else if (dia % 7 == 1) {
                        System.out.println("Lunes");
                    } else if (dia % 7 == 2) {
                        System.out.println("Martes");
                    } else if (dia % 7 == 3) {
                        System.out.println("Miercoles");
                    } else if (dia % 7 == 4) {
                        System.out.println("Jueves");
                    } else if (dia % 7 == 5) {
                        System.out.println("Viernes");
                    } else if (dia % 7 == 6) {
                        System.out.println("Sabado");
                    }

    }  
        
    }
     
    

