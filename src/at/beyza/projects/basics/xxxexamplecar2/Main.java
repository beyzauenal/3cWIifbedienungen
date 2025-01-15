package at.beyza.projects.basics.xxxexamplecar2;

public class Main {
    public static void main(String[] args) {
        LightElement light1 = new LightElement("Light1", "Red", 10);
        LightElement light2 = new LightElement("Light2", "Blue", 12);
        LightElement light3 = new LightElement("Light3", "Green", 15);

        Lamp lamp = new Lamp();
        lamp.addLightElement(light1);
        lamp.addLightElement(light2);
        lamp.addLightElement(light3);

        lamp.turnAllOn(); // Alle Glühelemente einschalten
        lamp.turnAllOn(); // Zweites Mal einschalten - sollte die Nachricht ausgeben

        System.out.println("Gesamtstromverbrauch: " + lamp.getOverallPowerUsage() + " Watt");
        lamp.printNamesOfLightElements(); // Namen der Glühelemente ausgeben
    }
}
 