package at.beyza.projects.basics.ooEinstieg;

public class Cars {
    private final int fuelUsage;           // Verbrauch pro Einheit
    private final String carColor;         // Farbe des Autos
    private final String carSerialNumber;  // Seriennummer
    private int remainingRange;            // Verbleibende Reichweite

    private int fuelAmount;                // Aktueller Kraftstoff
    private int amountOfRepetitions;       // Anzahl der Wiederholungen

    public Cars(int carConsumption, String carColor, String carSerialNumber, int fuelAmount) {
        this.fuelUsage = carConsumption;
        this.carColor = carColor;
        this.carSerialNumber = carSerialNumber;
        this.fuelAmount = fuelAmount;
        this.amountOfRepetitions = 0; // Wiederholungen
        this.remainingRange = calculateRemainingRange(); // Berechnung d. Reichweite
    }

    public void drive() {
        if (fuelAmount > 0) {
            fuelAmount -= fuelUsage;
            this.remainingRange = calculateRemainingRange(); // verbleibende Reichweite neu berechnen
        }
    }

    public void doBreak() {
        System.out.println("Das Auto bremst.");
    }

    public void turboBoost() {
        if (fuelAmount > fuelUsage * 0.1) {
            System.out.println("SuperBoostMode");
        } else {
            System.out.println("Nicht genug Kraftstoff für SuperBoost.");
        }
    }

    public void amountOfRepetitions(int repetition) {
        this.amountOfRepetitions = repetition; // Wiederholungen
        for (int i = 0; i < repetition; i++) {
            System.out.println("Tutututut");
        }
    }

    public int getRemainingRange() {
        return remainingRange;
    }

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = Math.min(fuelAmount, 100);
        this.remainingRange = calculateRemainingRange(); // Berechnung nach Kraftstoffs
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

    private int calculateRemainingRange() {
        if (fuelUsage > 0) {
            return fuelAmount / fuelUsage;
        }
        return 0; // Verhindert (/) durch (0)
    }
}
