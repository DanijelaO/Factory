package main.factory;
public class Car {
    private final String vehicleType= "car";
    private String model;
    private int buildYear;
    private int maxSpeed;
    private String color;
    private int maxFuel;
    private int currentFuel;
    private int consumption;
    private double mileage;
    private int passangers;
    private int seats;
    public Car() {
        this.model= "";
        this.buildYear = 0;
        this.color = "";
        this.maxFuel = 0;
        this.currentFuel = 0;
        this.consumption = 0;
        this.mileage=0;
        this.passangers=1;
        this.seats=5;
    }
    public Car( String customModel, int customBuildYear, String customColor, int customMaxFuel,int customCurrentFuel,
            int customConsumption, double customMileage, int customPassangers, int customSeats) {
        this.model= customModel;
        this.buildYear = customBuildYear;
        this.color = customColor;
        this.maxFuel = customMaxFuel;
        this.currentFuel = customCurrentFuel;
        this.consumption = customConsumption;
        this.mileage = customMileage;
        this.passangers= customPassangers;
        this.seats=customSeats;
    }
    public String getModel() {
        return this.model;
    }
    public void setModel (String customModel) {
        this.model = customModel;
    }
    public int getBuildYear() {
        return this.buildYear;
    }
    public void setBuildYear (int customBuildYear){
        this.buildYear = customBuildYear;
    }
    public String getColor() {
        return this.color;
    }
    public void setColor (String customColor){
        this.color = customColor;
    }
     public int getMaxFuel() {
        return this.maxFuel;
    }
    public void setMaxFuel (int customMaxFuel){
        this.maxFuel = customMaxFuel;
    }
    public int getCurrentFuel() {
        return this.currentFuel;
    }
    public void setCurrentFuel (int customCurrentFuel){
        this.currentFuel = customCurrentFuel;
    }
       public int getConsumption() {
        return this.consumption;
    }
    public void setConsumption (int customConsumption){
        this.consumption = customConsumption;
    }
    public String getVehicleType () {
        return this.vehicleType;
    }
    public double getMileage() {
        return this.mileage;
    }
    public void setMileage (int customMileage){
        this.mileage = customMileage;
    }
    public int getPassangers() {
        return this.passangers;
    }
    public void setPassangers (int customPassangers) {
        this.passangers= customPassangers;
    }
    public int getSeats() {
        return this.seats;
    }
    public void setSeats(int customSeats) {
        this.seats= customSeats;
    }
    public void showData() {
        System.out.println("Model: " + getModel());
        System.out.println("Godina proizvodnje: " + getBuildYear());
        System.out.println("Boja: " + getColor());
        System.out.println("Potrosnja: " + getConsumption());
        System.out.println("Potrosnja: " + getMaxFuel());
        System.out.println("Kilometraza: " + this.getMileage());
        System.out.println("Broj putnika je: " + this.getPassangers());
        System.out.println("Max br sedista je " + this.getSeats());
}
public void travel (int distance) {
if (this.getCurrentFuel() > (distance * this.getConsumption())/100){
    this.mileage = this.getMileage() + distance;
    this.currentFuel= this.getCurrentFuel() - (distance * this.getConsumption ())/100;
}
else{
       System.out.println("nema dovoljno goriva za put od:" + distance);
}
}
public void fuelUp (int refill) {
    int emptySpace=this.getMaxFuel()- this.getCurrentFuel();
    if (refill < emptySpace) {
       this.currentFuel=this.getCurrentFuel()+refill;
       System.out.println("Uspesno ste pili" + refill + "Novo stanje je:" + this.getCurrentFuel());
}   else{
        this.currentFuel=this.getMaxFuel();
        System.out.println("Rezervoar je pun. Sipali ste:" + emptySpace);
    }
}
public void getIn() {
   if (this.getPassangers()+1 <= this.getSeats()){
       this.setPassangers(this.passangers=this.getPassangers()+1);
   }
   else { System.out.println("Automobil je pun. Nema dovoljno mesta za jos jednog putnika");
               }
   }
}
//kolicina goriva da se smanji za onoliko koliko je potrebno
//kilometraza treba da se uveca
//prosirit jedan od konstruktora da moze da se setuje i mileage
//kolicina goriva da se smanji za onoliko koliko je potroseno
//kilometraza treba da se uveca