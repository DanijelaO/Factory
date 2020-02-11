
package main.factory;


public class Car {
    private final String vehicleType = "car";
    private String model;
    private int buildYear;
    private int maxSpeed;
    private String color;
    private int maxFuel;
    private int currentFuel;
    private int consumption;
    
    public Car() {
        this.model= "";
        this.buildYear = 0;
        this.color = "";
        this.maxFuel = 0;
        this.currentFuel = 0;
        this.consumption = 0;
    }
    
    public Car(String customModel, int customBuildYear, String customColor, int customMaxFuel, int customCurrentFuel, int customConsumption) {
        this.model = customModel;
        this.buildYear = customBuildYear;
        this.color = customColor;
        this.maxFuel = customMaxFuel;
        this.currentFuel = customCurrentFuel;
        this.consumption = customConsumption;
       
        
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
    
    public String getVechileType (){
        return this.vehicleType;
    }
    
    public void travel(int distanceTraveled) {
      //1definisati nov atribut "mileage"
      //2napraviti get i set metode
      //3prosiriti jedan od konstrukotra da moze da se setuje i mileage
      
      
      //4kolicina goriva da se smanji za onoliko koliko je potroseno
      //5kilometraza treba da se uveca
      //6mileage
    }
    
    public void showData() {
        System.out.println("Model: " + getModel());
        System.out.println("Godina proizvodnje: " + getBuildYear());
        System.out.println("Boja: " + getColor());
        System.out.println("Potrosnja: " + getConsumption());
        System.out.println("Potrosnja: " + getMaxFuel());
        System.out.println("");
    }
}