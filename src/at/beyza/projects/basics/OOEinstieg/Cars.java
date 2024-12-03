package at.beyza.projects.basics.OO;


public class Cars {
    // Instanz/Gedächtnisvariablen
    public int carSpritverbrauch;
    public String carcolor;
    public String carserialNumber;
    public int fuelAmount;

    // Methode zum Fahren
    public void drive() {
        this.fuelAmount = this.fuelAmount - carSpritverbrauch;
        System.out.println("I'm driving");
    }

    // Methode zum Bremsen
    public void dobreak() {
        System.out.println("Ich bremse");
    }

    // Methode für TurboBoost
    public void turboBoost() {
        if (fuelAmount > carSpritverbrauch * 0.1) {
            System.out.println("SuperBoostMode");
        } else {
            System.out.println("Not enough fuel to go to Superboost");
        }
    }

    // Methode für Wiederholungen
    public void amountOfRepetitions(int repetition) {
        for (int i = 0; i < repetition; i++) {
            System.out.println("This is repetition number " + (i + 1));
        }
    }

    // Methode, um die verbleibende Reichweite zu berechnen
    public void getRemainingRange() {
        int range = fuelAmount / carSpritverbrauch;
        System.out.println("Remaining range: " + range + " kilometers");
    }
}
