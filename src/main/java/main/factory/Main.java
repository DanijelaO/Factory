
package main.factory;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Pocetak");
        
        Car fiat = new Car();
        fiat.model = "Fiat Punto";
        fiat.buildYear = 2010;
        fiat.color ="black";
        fiat.consumption = 6;
        fiat.maxSpeed = 180;
        fiat.currentFuell = 20;
        fiat.maxFuell = 45;
        
        System.out.println("Model: " + fiat.model);
        System.out.println("Model: " + fiat.model);
        System.out.println("Model: " + fiat.model);
        System.out.println("Model: " + fiat.model);
        System.out.println("Model: " + fiat.model);
        System.out.println("Model: " + fiat.model);
        
        Car ford = new Car ();
        ford.model = "Ford Fiesta";
        ford.buildYear = 2015; 
        
        System.out.println("Model: " + ford.model);
        System.out.println("Godina proizvodnje: " + ford.buildYear);
        
        
        
    }
    
}
