package at.beyza.projects.basics.ooEinstieg;

public class Main2 {
    public static void main(String[] args) {
        Fernbedienung remoteControl = new Fernbedienung(100, 100); // Beide Batterien starten mit 100% Ladung

        System.out.println("Ladestatus: " + remoteControl.getStatus() + "%");

        remoteControl.turnOn(); // Verbraucher wird

        // angeschlossen
        System.out.println("Ladestatus nach Einschalten: " + remoteControl.getStatus() + "%");

        remoteControl.turnOff(); // Verbraucher wird ausgeschaltet
        System.out.println("Ladestatus nach Ausschalten: " + remoteControl.getStatus() + "%");
    }
}
