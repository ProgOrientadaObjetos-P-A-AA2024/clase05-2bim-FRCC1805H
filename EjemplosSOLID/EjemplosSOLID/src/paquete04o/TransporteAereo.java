/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04o;

/**
 *
 * @author LENOVO
 */
public class TransporteAereo extends Transporte {
    
    private String cooperativaAereo;
    
    
    public void establecerCooperativaAereo(String n){
        cooperativaAereo = n;
    }
    
    
    @Override
    public void establecerTarifa(){
        tarifa = 0.40 + (0.40*0.5);
    }
    
    
    public String obtenerCooperativaAereo(){
        return cooperativaAereo;
    }
}
