/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

/**
 *
 * @author Estudiante
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        {
            int N;
            double A;
            char C = ' ';
            System.out.println("Digite 2 números y una letra");
            N = Integer.parseInt(teclado.nextLine());
            A = Double.parseDouble(teclado.nextLine());
            C = (char) Integer.parseInt(teclado.nextLine());
            double suma;
            double diferencia;
            System.out.println("El primer ejercicio es " + '\n');
            System.out.println("El valor de A es " + A + '\n');
            System.out.print("El valor de N es " + N + '\n');
            System.out.println("El valor de C es " + C + '\n');

            suma = A + N;
            System.out.println("El valor de la suma es de " + suma + '\n');

            diferencia = A - N;
            System.out.println("El valor de la diferencia es de " + diferencia + '\n');
            System.out.println("El valor de C es " + C + '\n');
        }
        {
            System.out.println("El segundo ejercicio es" + '\n');

            int Y;
            int X;
            double M;
            double N;

            System.out.println("Digite dos número entero");
            Y = Integer.parseInt(teclado.nextLine());
            X = Integer.parseInt(teclado.nextLine());
            System.out.println("Digite dos número decimales");
            M = Double.parseDouble(teclado.nextLine());
            N = Double.parseDouble(teclado.nextLine());

            double resta;
            double suma;
            double multiplicación;
            double divición;

            resta = X - M;
            suma = N + Y;
            multiplicación = M * N;
            divición = X / Y;

            System.out.println("El valor de la resta es " + resta + '\n'
                    + "El valor de la suma es de " + suma + '\n'
                    + "El valor de la multiplicación es de " + multiplicación + '\n'
                    + "El valor de la divición es de " + divición + '\n');
        }
        {
            System.out.println("El tercer ejercicio" + '\n');
            int N;
            int Inc;
            int Dec;
            int Dup;

            System.out.println("Digite un número");
            N = Integer.parseInt(teclado.nextLine());

            Inc = N + 77;
            Dec = N - 3;
            Dup = N * 2;

            System.out.println("El valor incrementado es de " + Inc + '\n'
                    + "El valor decrementado es de " + Dec + '\n'
                    + "El valor duplicado es de " + Dup + '\n');

        }
        {
            System.out.println("El cuarto ejercicio" + '\n');
            int A;
            int B;
            int C;
            int D;
            int Cam;
            int Cam1;
           
            System.out.println("Digite 4 números enteros");
            A = Integer.parseInt(teclado.nextLine());
            B = Integer.parseInt(teclado.nextLine());
            C = Integer.parseInt(teclado.nextLine());
            D = Integer.parseInt(teclado.nextLine());

            System.out.println("El valor de A es " + A + '\n'
                    + "El valor de B es " + B + '\n'
                    + "El valor de C es " + C + '\n'
                    + "El valor de D es " + D + '\n');
           
            Cam = B;
            B = C;
            Cam1 = D;
            D = Cam;
            C = A;
            A = Cam1;

            System.out.println("El valor de A es " + A + '\n'
                    + "El valor de B es " + B + '\n'
                    + "El valor de C es " + C + '\n'
                    + "El valor de D es " + D + '\n');

        }
        {
            System.out.println("El quinto ejercicio" + '\n');
            int A;
            System.out.println("Digite el número");
            A = Integer.parseInt(teclado.nextLine());
            if (A % 2 == 0) {
                System.out.println("El número es par");
            } else {
                System.out.println("El número es impar");
            }

        }
        {
            System.out.println("El sexto ejercicio" + '\n');
            int B;
            System.out.println("Ingrese un número entero ");
            B = Integer.parseInt(teclado.nextLine());

            if (B < 0) {
                System.out.println("El número es negativo");
            } else {
                System.out.println("El número es positivo");
            }
            
             if (B % 2 == 0) {
                System.out.println("El número es par");
            } else {
                System.out.println("El número es impar");
            }
             
             if (B% 5 ==0){
                System.out.println("El número es multiplo de 5");
            } else {
                System.out.println("El número es no es multiplo de 5");
            }
              if (B% 10 ==0){
                System.out.println("El número es multiplo de 10");
            } else {
                System.out.println("El número es no es multiplo de 10");
            }
        }
        }

    }

