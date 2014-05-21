/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkgswitch;

/**
 *
 * @author dell 3110
 */
public class operaciones {
    public double Sumar(double valor1, double valor2)
    {
     return valor1+valor2;
    }
 public double Resta (double valor1, double valor2)
    {
        return valor1 - valor2;
    }
    public double Division(double valor1, double valor2) {
        if (valor1 == 0)
        {
            return 0;
        }
        else 
        {
            return valor1 / valor2;
        }

    }
    public double Multiplicacar (double valor1, double valor2)
    {
     return (valor1*valor2);
    }
    
    public double Raíz (double valor1)
    {
       return Math.sqrt(valor1);
    }
    
    public double potencia (double valor1, double valor2)
    {
     return Math.pow(valor1, valor2);
    
    }
}