/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaciclos;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class PracticaCiclos {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner teclado = new Scanner (System.in);      
         {
         int n;
        
        System.out.println("Digite un número");
        
        n=Integer.parseInt(teclado.nextLine());
        
        for (int i = 0; i <n; i++) {
            System.out.println('*');  
        }
      }
      {
        /**
         * segundo
         */
          int n;
          int y;
          System.out.println("Digite dos número");
           n=Integer.parseInt(teclado.nextLine());
           y=Integer.parseInt(teclado.nextLine());
           
          for (int i = 0; i <= n; i++) {
             if(i%y==0)
             {  System.out.println('*');
             }
           else{
              System.out.println(i);}
            }
    }
    {
     /**
      * tercero
      */       
        
      double i;
      double f;
      double iD;
      
        System.out.println(" Digite el valor inical ");
        i=Double.parseDouble(teclado.nextLine());
        System.out.println(" Digite el valor final ");
        f=Double.parseDouble(teclado.nextLine());
        System.out.println(" Digite el incremento deseado ");
        iD=Double.parseDouble(teclado.nextLine());
        
        for (double j = i; j <= f; j=j+iD) {
            System.out.println(j);
        }
    }
    {
      /**
       * cuarto
       * No sé hace
       */
        
        /**
         * Quinto
         */
        System.out.println("\n");
        int elevado =0;
        double base =0;
        int cont =1;
        int result =0;
        double base2 =0;
        
        System.out.println("Ingrese la base");
        base=Double.parseDouble(teclado.nextLine());
        System.out.println("Ingrese el exponente");
        elevado=Integer.parseInt(teclado.nextLine());
        
        if (elevado==1){
            result =(int) base*1;
        } else{
            base2= base;
        }
        while (cont < elevado){
           
            cont++;
            result = (int)((int) base*base2);
            base2 = result;
        }
        System.out.println("El resultado de la elevación es de "+ result);
    }
    {
    /**
     * Sexto
     */
       int res;
       
        System.out.println("Los números de 5 digitos, posibles son: ");
        res = Integer.parseInt(teclado.nextLine());
        for (int i = 11111; i < 100000; i++) {
            res= i++;
            System.out.println(i+"\n");
            
        }
         
    }
    {
    /**
     * Séptimo
     */
        
        int par = 0;
        int imp = 0;
        int n;
        int r;
        
        do{
        System.out.println("Digite un número");
        n=Integer.parseInt(teclado.nextLine());
        
         if ( n%2 != 0) {
           par = par + 1; }
         else { 
          imp = imp + 1; }
       
         System.out.println("¿Desea continuar? 1 =si 2 =no");
           r = Integer.parseInt(teclado.nextLine());
        } while  (r == 1);
        
        System.out.println(" El número de impares es de " + imp);
        System.out.println(" El número de impares es de " + par);
    }
    {
    /**
     * Octavo 
     */
        int n;
        int mult;
        int c =0;
        System.out.println("Digite el número");
        n=Integer.parseInt(teclado.nextLine());
        
        for (int i= 0; i <= 10; i++) {
            mult= n+i;
            System.out.println(n+"*"+i+'='+ mult);
            System.out.println(mult);
            
        }
        
        while (c<=10);
        {
               System.out.println(n+"*"+c+'=');
            mult = n*c;
            System.out.println(mult);
            c++;
        }
         do{
              System.out.println(n+"*"+c+'=');
            mult = n*c;
            System.out.println(mult);
            c++;
         }while (c<=10);
    }
    {
       /**Noveno
        * 
        */
             int p = 0;
             int r;
             int c = 0;
             do{
                 int n;
             System.out.println("Ingrese el número");
             n=Integer.parseInt(teclado.nextLine());         
             p=n+p;
           
           System.out.println("¿Desea ingresar otro número? 1 =si 2 =no");
           r = Integer.parseInt(teclado.nextLine());
           c=c+1;
           }while (r==1);        
           p=p/c;
           System.out.println("El promedio es de "+p);
    }
    {
    /**
     * Decimo
     */
        int n;
        int p=0;
        int r;
        int c=0;
        do{
            {
            System.out.println("Digite la calificación");
            n=Integer.parseInt(teclado.nextLine());
            p= p+n;
            System.out.println("¿Desea ingresar otro número? 1 =si 2 =no");
            r = Integer.parseInt(teclado.nextLine());
            c++;
            }while (r==1);  
            p=p/c;
            System.out.println("El promedio es de "+p);
        }while (n==0);
    }
    {
    /**
     * Undécimo
     */
        int d;
        System.out.println("La lista de cambio es de ");
        
        for (int i = 1; i <= 10; i++) {
            d=i*560;
            System.out.println(d);
            
        }
        
    }
    {
        /**
         * Duodécimo
         */
        int t= 1000;
        for (int i = 0; i <= 12; i++) {
            double inte; 
             inte = t * 0.02;
            t= (int) ((int) t*inte);
            
        }
        System.out.println("El total después de un año es de "+t);
    }
    {
    /**
     * Decimotercero
     */
        int s=0;
        int m=0;
        int h=0;
        
        while (h<24) {
        
            while (m<59)
            { 
            while (s<59){
               s=0;
                if(s<59){
                   s++;
                   System.out.println(h+":"+m+":"+s);
                }
              if(m<59)
              { m++;
                  System.out.println(h+":"+m+":"+s);
              }
              else{
               m++;
              }
                 m=0;
              }
            
            }
        }
            s=0;
            m=0;
            h++;
        }
    }
    {
    /**
     * Decimocuarto
     */
        int t=1000;
        int m=0;
       do{
           int inte;
           inte =(int) (t*0.02);
           t=t+inte;
           m++;
       }while(t==1500);
            System.out.println("Tardo "+m+" para tener $1500 en su cuenta");
     }
    {
    /**
     * Decimoquinto
     */
        System.out.println("\n");
        int impares;
        int b=1;
        int n=0;
        int resp=1;
        
        System.out.println("¿cuántos números impares?");
        impares=Integer.parseInt(teclado.nextLine());
        System.out.println("\n");
        
        while (resp <= impares)
        {
         if (n <b) {
             System.out.println(resp);
             
             n++;
             resp=resp+2;
         }else{
             System.out.println();
             b++;
             n =0;
             resp =1;
         
         }
            
        }
        System.out.println("");
    }
    }
  
    
  
