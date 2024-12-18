package at.beyza.projects.basics.ooEinstieg;

public class Motor {
    private Tank tank;
    private int speed; // Geschwindigkeit von 1 bis 100

    public Motor(Tank tank) {
        this.tank = tank;
        this.speed = 0; // Anfangsgeschwindigkeit
    }

    //Geschwindigkeit auf eine Wert von 1 bis 100
    public void setSpeed(int speed) {
        if (speed >= 1 && speed <= 100) {
            this.speed = speed;
            System.out.println("Die Geschwindigkeit wurde auf " + speed + " km/h gesetzt.");
        } else {
            System.out.println("Ungültige Geschwindigkeit. Sie muss zwischen 1 und 100 liegen.");
        }
    }

    // Berechnet Kraftstoffverbrauch je nach Geschwindigkeit
    public void drive(int speed) {
        if (tank.getFuelAmount() > 0) {
            setSpeed(speed);
            double fuelConsumption = speed * -2; // Verbrauch pro km basiert auf der Geschwindigkeit
            tank.useFuel(fuelConsumption);
            System.out.println("Das Fahrzeug fährt mit " + speed + " km/h und verbraucht " + fuelConsumption + " Einheiten Kraftstoff.");
        } else {
            System.out.println("Nicht genug Kraftstoff!");
        }
    }

    public void stop() {
        speed = 0;
        System.out.println("Das Fahrzeug wurde gestoppt.");
    }

    public int getSpeed() {
        return speed;
    }
}


