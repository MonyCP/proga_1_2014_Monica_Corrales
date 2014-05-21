/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package atributes;

/**
 *
 * @author dell 3110
 */
public class Account {
    
    private double saldoInicial;
    private boolean hayErrror;
    
    
    public Account ()
    {
     saldoInicial =0;
     hayErrror=false;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }
    
  /**
   * Este Método sirve para aumentar la cuenta de un usuario
   * @param monto Parámetro para recibir el nuevo monto
   */
 
    
    public void Deposito(double monto)
    {
        setSaldoInicial(getSaldoInicial() + monto);
    }
    
    /**
   * Este Método sirve para disminuir la cuenta de un usuario
   * @param monto Parámetro para recibir el nuevo monto
   */
    
    public void Retiro (double monto)
    {
        if(getSaldoInicial()>=monto)
            setSaldoInicial(getSaldoInicial() - monto);
        else 
            setHayErrror(true);
    }

    /**
     * @return the hayErrror
     */
    public boolean isHayErrror() {
        return hayErrror;
    }

    /**
     * @param hayErrror the hayErrror to set
     */
    public void setHayErrror(boolean hayErrror) {
        this.hayErrror = hayErrror;
    }
}
