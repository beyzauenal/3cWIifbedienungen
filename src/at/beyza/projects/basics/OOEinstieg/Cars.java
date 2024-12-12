package at.beyza.projects.basics.OO;

public class Cars {
    // Instanzvariablen
    private int fuelUsage; // Verbrauch pro Einheit
    private String carColor; // Farbe des Autos
    private String carSerialNumber; // Seriennummer

    private int amountOfRepetitions; // Anzahl der Wiederholungen
    private int remainingRange; // Verbleibende Reichweite
    private int fuelAmount; // Aktueller Kraftstoff

    // Konstruktor
    public Cars(int carConsumption, String carColor, String carSerialNumber, int fuelAmount) {
        this.fuelUsage = carConsumption; // Initialisierung der Verbrauchswerte
        this.carColor = carColor; // Initialisierung der Farbe
        this.carSerialNumber = carSerialNumber; // Initialisierung der Seriennummer
        this.fuelAmount = fuelAmount; // Initialisierung des Kraftstoffs
    }

    // Methode zum Fahren
    public void drive() {
        if (fuelAmount > 0) { // Logischer Vergleich, ob genug Kraftstoff vorhanden ist
            fuelAmount -= fuelUsage; // Verbrauch reduzieren
            // System.out.println("I'm driving");
        }
    }

    // Methode zum Bremsen
    public void doBreak() {
        // System.out.println("Ich bremse.");
    }

    // Methode für TurboBoost
    public void turboBoost() {
        if (fuelAmount > fuelUsage * 0.1) { // Bedingung für den TurboBoost
            System.out.println("SuperBoostMode");
        } else {
            System.out.println("Not enough fuel to activate SuperBoost.");
        }
    }

    // Methode zur Berechnung der Wiederholungen
    public void amountOfRepetitions(int repetition) {
        for (int i = 0; i < repetition; i++) {
            // System.out.println("Tutututut");
        }
    }

    // Methode für die verbleibende Reichweite
    public void getRemainingRange() {
        if (fuelUsage > 0) { // Verhindert Division durch null
            remainingRange = fuelAmount / fuelUsage;
        }
        // System.out.println(remainingRange);
    }

    // Setter-Methoden
    public void setFuelUsage(int fuelUsage) {
        this.fuelUsage = fuelUsage;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public void setCarSerialNumber(String carSerialNumber) {
        this.carSerialNumber = carSerialNumber;
    }

    public void setFuelAmount(int fuelAmount) {
        if (fuelAmount > 100) { // Beschränkung der maximalen Kraftstoffmenge
            this.fuelAmount = 100;
        } else {
            this.fuelAmount = fuelAmount;
        }
    }

    public void setAmountOfRepetitions(int amountOfRepetitions) {
        this.amountOfRepetitions = amountOfRepetitions;
    }

    public void setRemainingRange(int remainingRange) {
        this.remainingRange = remainingRange;
    }

    // Getter-Methoden
    public String getCarColor() {
        return carColor;
    }

    public int getFuelUsage() {
        return fuelUsage;
    }

    public String getCarSerialNumber() {
        return carSerialNumber;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public int getAmountOfRepetitions() {
        return amountOfRepetitions;
    }

    public int getRemainingRange() {
        return remainingRange;
    }
}

