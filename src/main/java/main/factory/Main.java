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
        System.out.println("Pocetak");
        String message = "Ovo je poruka";
        Car fiat = new Car("Fiat punto", 2010, "black", 45, 20 , 6, 200, 4, 5 );
        fiat.showData ();
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
        Car ford = new Car("Ford", 2019, "black", 50, 20 , 6,300, 2, 5 );
        ford.showData();
        Car lada = new Car("Niva", 2016, "black", 50, 20 , 6, 500, 2, 5);
        lada.showData();
        lada.travel(20);
        lada.showData();
        lada.fuelUp (20);
        lada.travel(400);
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
        System.out.println("Model: " + ford.getModel());
    }
}