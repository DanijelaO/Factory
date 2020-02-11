package main.factory;
/**
 *
 * @author qa
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Car fiat = new Car("FiatPunto", 2010, "black", 45, 15, 8);
        fiat.showData();
        
        // fiat.model = "Fiat Punto";
        // fiat.buildYear = 2010;
        // fiat.color = "black";
        // fiat.consumption = 6;
        // fiat.maxSpeed = 180;
        // fiat.currentFuel = 20;
        // fiat.maxFuel = 45;
        
        fiat.setModel("Fiat Punto");
        fiat.setColor("black");
        fiat.setMaxFuel(60);
        fiat.setConsumption(6);
        fiat.showData();
        
        Car ford = new Car("Ford", 2015,"red",40, 10, 5);
        fiat.showData();
       // ford.model = "Focus";
       // ford.buildYear = 2015;
       // ford.color = "white";
       // ford.consumption = 10;
       // ford.maxSpeed = 220;
       // ford.currentFuel = 30;
       // ford.maxFuel = 60;
        ford.setModel("Focus");
        ford.setBuildYear(2015);
        ford.setConsumption(5);
        ford.setColor("white");
        
        ford.showData();
        
        Car Honda = new Car("Civic", 2015, "red",50, 20, 10);
        Honda.showData();
        
        //System.out.println("Model: " + ford.getModel());
    }
}
