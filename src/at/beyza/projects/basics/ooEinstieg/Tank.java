package at.beyza.projects.basics.ooEinstieg;

public class Tank {
    private double fuelAmount;

    public Tank(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public void useFuel(double amount) {
        if (fuelAmount >= amount) {
            fuelAmount -= amount;
        } else {
            System.out.println("Nicht genug Kraftstoff.");
        }
    }

    public void refuel(double amount) {
        fuelAmount += amount;
    }
}
