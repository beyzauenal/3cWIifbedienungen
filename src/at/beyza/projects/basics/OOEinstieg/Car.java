package at.beyza.projects.basics.OOEinstieg;

public class Car {
    // Instanz / Gedächtnisvariablen
    public int fuelConsumption;
    public int fuelAmount;
    public String brand;
    public String serialNumber;
    private String color;

    public void drive() {
        this.fuelAmount -= fuelConsumption;
        System.out.println("I am driving");
    }
}
