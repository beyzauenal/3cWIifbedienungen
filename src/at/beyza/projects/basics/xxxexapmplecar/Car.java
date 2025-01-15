package at.beyza.projects.basics.xxxexapmplecar;

public class Car {
    private String color;
    private double maxSpeed;
    private double basePrice;
    private double baseConsumption;
    private Manufacturer manufacturer;
    private Engine engine;

    public Car(String color, double maxSpeed, double basePrice, double baseConsumption, Manufacturer manufacturer, Engine engine) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.basePrice = basePrice;
        this.baseConsumption = baseConsumption;
        this.manufacturer = manufacturer;
        this.engine = engine;
    }

    public double calculatePrice() {
        return basePrice - (basePrice * manufacturer.getDiscountPercentage() / 100);
    }

    public double calculateConsumption(double kilometersDriven) {
        if (kilometersDriven <= 50000) {
            return baseConsumption;
        }
        return baseConsumption * 1.098;
    }

    // toString Methode ohne @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", price=" + calculatePrice() +
                ", consumption (base)=" + baseConsumption +
                ", manufacturer=" + manufacturer.getName() +
                ", engine=" + engine.getType() +
                " (" + engine.getPower() + " HP)" +
                '}';
    }
}
