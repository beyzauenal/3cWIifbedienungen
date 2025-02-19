package at.beyza.projects.basics.ooEinstieg;

public class Main {
    public static void main(String[] args) {

        // Initialisierung der Objekte
        engine e1 = new engine(140, engine.TYPE.DIESEL);  // Engine-Objekt
        RearMirror r1 = new RearMirror(100, 0);  // Rückspiegel 1
        RearMirror r2 = new RearMirror(90, 40);  // Rückspiegel 2

        // Reifen erstellen
        Reifen reifen1 = new Reifen(17, "Sommer");
        Reifen reifen2 = new Reifen(17, "Sommer");
        Reifen reifen3 = new Reifen(17, "Sommer");
        Reifen reifen4 = new Reifen(17, "Sommer");

        // Konstruktor der Car-Klasse erfordert mehr Parameter
        Car c1 = new Car(e1, "red", "123ABC", 50, 5); // Beispielwerte für carSerialNumber und fuelAmount
        c1.addMirror(r1);
        c1.addMirror(r2);

        c1.addReifen(reifen1);
        c1.addReifen(reifen2);
        c1.addReifen(reifen3);
        c1.addReifen(reifen4);

        // Ausgabe der Position des ersten Rückspiegels und der PS des Motors
        System.out.println(c1.getMirrors().get(0).getPosition());
        System.out.println(c1.getEngine().getHorsePower());
        System.out.println("Das Auto hat " + c1.getMirrors().size() + " Rückspiegel.");
        System.out.println("Das Auto hat " + c1.getReifen().size() + " Reifen.");

        // Testen Truck
        Truck t1 = new Truck(e1, "Mercedes", "Green", "Trailer1");
        System.out.println("Colour: " + t1.getCarColor() + ", Trailer: " + t1.getTrailer());
        t1.drive();
        t1.stop();


    }

}
