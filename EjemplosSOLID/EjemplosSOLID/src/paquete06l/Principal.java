/*
 * L — Liskov substitution principle (Principio de sustitución de Liskov) 
 */
package paquete06l;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        
        Banco b1 = new Banco();
        b1.establecerNombre("Banco de Loja");
        
        //TarjetaCredito t1 = new TrajetaCredito("");
        TarjetaCredito t1 = new TarjetaCredito();
        t1.establecerNombre("Visa");
        t1.establecerNumero("1104714041");
        t1.establecerBanco(b1);
        
        
        MayorEdad representante = new MayorEdad("José",t1);
        
        MenorEdad menor = new MenorEdad("Felipe", representante);
        
        
        System.out.printf("Nombre:%s - Tarjeta:%s\n",
                menor.obtenerNombre(), 
                menor.obtenerRepresentante().obtenerTarjeta());
        
    }
}
