package at.beyza.projects.basics.OO;

public class Cars {
    // Instanzvariablen
    private int carKonsumption; // Verbrauch pro Einheit
    private String carColor; // Farbe des Autos
    private String carSerialNumber; // Seriennummer
    private int fuelAmount; // Verbleibender Kraftstoff
    private String brand; // Marke des Autos

    // Konstruktor
    public Cars(int carKonsumption, String carColor, String carSerialNumber, int fuelAmount) {
        this.carKonsumption = carKonsumption;
        this.carColor = carColor;
        this.carSerialNumber = carSerialNumber;
        this.fuelAmount = fuelAmount;
        this.brand = "Unknown"; // Standardwert für die Marke
    }

    // Methode zum Fahren
    public void drive() {
        if (fuelAmount >= carKonsumption) {
            fuelAmount -= carKonsumption;
            System.out.println("I'm driving.");
        } else {
            System.out.println("Not enough fuel to drive.");
        }
    }

    // Methode zum Bremsen
    public void doBreak() {
        System.out.println("Ich bremse.");
    }

    // Methode für TurboBoost
    public void turboBoost() {
        if (fuelAmount > carKonsumption * 0.1) {
            System.out.println("SuperBoostMode activated!");
        } else {
            System.out.println("Not enough fuel to activate SuperBoost.");
        }
    }

    // Methode zur Berechnung der verbleibenden Reichweite
    public void getRemainingRange() {
        if (carKonsumption > 0) {
            int range = fuelAmount / carKonsumption;
            System.out.println("Remaining range: " + range + " units.");
        } else {
            System.out.println("Invalid consumption value. Cannot calculate range.");
        }
    }

    // Methode für Wiederholungen (neu hinzugefügt)
    public void amountOfRepetitions(int repetition) {
        for (int i = 1; i <= repetition; i++) {
            System.out.println("This is repetition number " + i);
        }
    }

    // Getter-Methoden
    public int getCarKonsumption() {
        return carKonsumption;
    }

    public String getCarColor() {
        return carColor;
    }

    public String getCarSerialNumber() {
        return carSerialNumber;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public String getBrand() {
        return brand;
    }

    // Setter-Methoden (falls benötigt)
    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
