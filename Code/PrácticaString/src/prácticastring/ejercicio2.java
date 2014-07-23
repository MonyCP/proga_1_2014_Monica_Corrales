/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prácticastring;

/**
 *
 * @author dell 3110
 */
public class ejercicio2 {
    private String Cadena;
    
        public boolean Palindromo () 
    {
        String palabreAlrevez = "";
        
        for (int i = getCadena().length() - 1; i >= 0; i--) {
            palabreAlrevez += getCadena().charAt(i);
        }
        if(getCadena().equals(palabreAlrevez))
        {
            return true;
        }
        else
        {    
            return false;
        }
    }

    public String getCadena() {
        return Cadena;
    }

    public void setCadena(String Cadena) {
        this.Cadena = Cadena;
    }
    
    
}
