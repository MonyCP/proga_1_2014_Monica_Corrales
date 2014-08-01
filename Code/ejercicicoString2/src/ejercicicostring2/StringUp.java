/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicicostring2;

/**
 *
 * @author dell 3110
 */
public class StringUp {
    
    private String hilera="HoLa";
    
    public String SubString(int begin, int end) throws Exception
    {
                
        String retorno="";
        
        if(end<begin)
        {
            throw new Exception("Error el final no puede ser menor al inicio");
        }
        if(getHilera().length()<0)
        {  
            throw new Exception("La hilera tiene que contener caracteres");
        }

        for (int i = begin-1; i < end; i++) {
            retorno+=getHilera().charAt(i);
            
        }
           return retorno;
    }
    
    public String topUpperCase()
    {
        String retorno="";
        
        String mayusculas="ABCDEFGHIJKLMNÑOPQRSTUWXYZ";
        String minusculas="abcdefghijklmnñopqrstuwxyz";
        
        char temporal;
        int index=0;
        
        for (int i = 0; i < getHilera().length(); i++) {
            //isLowerCase= es para minusculas, en este caso pregunta si los caracteres son minusculas
            if( Character.isLowerCase(getHilera().charAt(i)))
            {
                index=minusculas.indexOf(getHilera().charAt(i));
                retorno+=mayusculas.charAt(index);
            }
            else
            {
                retorno+=getHilera().charAt(i);
            }
        }
        return retorno;
    }

    /**
     * @return the hilera
     */
    public String getHilera() {
        return hilera;
    }

    /**
     * @param hilera the hilera to set
     */
    public void setHilera(String hilera) {
        this.hilera = hilera;
    }
    
}
