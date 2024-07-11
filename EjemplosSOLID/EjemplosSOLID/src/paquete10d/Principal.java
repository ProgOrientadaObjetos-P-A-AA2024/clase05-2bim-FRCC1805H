/*
 * 
 * D - Dependency inversion principle (Principio de inversión de dependencias)
 */
package paquete10d;

public class Principal {
    public static void main(String[] args) {
        
        APINetflix api = new APINetflix();
        api.establecerApiKey("123455");
        
        GeneradorPeliculas gp = new GeneradorPeliculas();
        gp.establecerLlave(api);
        gp.establecerUrl("http://api.movie?api=");
        System.out.println(gp.obtenerUrl());
         
        System.out.println("---------------------------");
        
        APIAmazonMovie api2 = new APIAmazonMovie();
        api2.establecerApiKey("123455");
        
        GeneradorPeliculas gp2 = new GeneradorPeliculas();
        gp2.establecerLlave(api2);
        gp2.establecerUrl("http://api.movie?api=");
        System.out.println(gp2.obtenerUrl());
        
        System.out.println("----------------------------");
        
        APIDigo dg = new APIDigo();
        dg.establecerApiKey("123455");
        
        GeneradorPeliculas gd = new GeneradorPeliculas();
        gd.establecerLlave(api);
        gd.establecerUrl("http://api.disneyp");
        System.out.println(gd.obtenerUrl());
        
        System.out.println("----------------------------");
        
        APIDisneyPlus dp = new APIDisneyPlus();
        dp.establecerApiKey("123455");
        
        GeneradorPeliculas gg = new GeneradorPeliculas();
        gg.establecerLlave(api);
        gg.establecerUrl("htpp://api.digo=5gh");
        System.out.println(gg.obtenerUrl());
    }
}
