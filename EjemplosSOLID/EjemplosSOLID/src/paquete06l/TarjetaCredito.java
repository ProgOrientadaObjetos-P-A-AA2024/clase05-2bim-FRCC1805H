/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06l;

/**
 *
 * @author LENOVO
 */
public class TarjetaCredito {
    private String nombre;
    private String numero;
    private Banco banco;
    
    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerNumero() {
        return numero;
    }
    
    public Banco obtenerBanco(){
        return banco;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerNumero(String n) {
        numero = n;
    }
    public void establecerBanco(Banco b){
        banco = b;
    }
}
