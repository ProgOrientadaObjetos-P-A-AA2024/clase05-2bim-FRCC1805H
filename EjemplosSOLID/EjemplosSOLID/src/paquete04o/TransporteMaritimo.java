/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04o;

/**
 *
 * @author LENOVO
 */
public class TransporteMaritimo extends Transporte {
    
    private String cooperativaMaritimo;
    
    
    public void establecerCooperativaMaritimo(String n){
        cooperativaMaritimo = n;
    }
    
    
    @Override
    public void establecerTarifa(){
        tarifa = 0.40 + (0.40*0.5);
    }
    
    
    public String obtenerCooperativaMaritimo(){
        return cooperativaMaritimo;
    }
    
}
