package at.beyza.projects.basics.ooEinstieg;
public class Battery {
    private double charge; // Prozentualer Ladezustand der Batterie

    public Battery(double charge) {
        this.charge = charge;
    }

    // Gibt den aktuellen Ladezustand der Batterie zurück
    public double getStatus() {
        return charge;
    }

    // Verringert die Ladung der Batterie um 5% und gibt eine Nachricht aus
    public void turnOn() {
        charge -= 5;
        System.out.println("Verbraucher angeschlossen");
    }

    // Gibt eine Nachricht aus, wenn der Verbraucher ausgeschaltet wird
    public void turnOff() {
        System.out.println("Kein Verbraucher angeschlossen");
    }
}
