package at.beyza.projects.basics.ooEinstieg;

public class Fernbedienung {
    private Battery battery1;
    private Battery battery2;

    public Fernbedienung(double chargeBattery1, double chargeBattery2) {
        battery1 = new Battery(chargeBattery1);
        battery2 = new Battery(chargeBattery2);
    }

    // Berechnet den Mittelwert der Ladezustände beider Batterien
    public double getStatus() {
        double status1 = battery1.getStatus();
        double status2 = battery2.getStatus();
        return (status1 + status2) / 2;
    }

    // Ruft die turnOn()-Methode für beide Batterien auf
    public void turnOn() {
        battery1.turnOn();
        battery2.turnOn();
    }

    // Ruft die turnOff()-Methode für beide Batterien auf
    public void turnOff() {
        battery1.turnOff();
        battery2.turnOff();
    }
}

