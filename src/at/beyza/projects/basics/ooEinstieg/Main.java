package at.beyza.projects.basics.ooEinstieg;

public class Main {
    public static void main(String[] args) {

        // Initialisierung der Objekte
        engine e1 = new engine(140, engine.TYPE.DIESEL);
        RearMirror r1 = new RearMirror(100, 0);
        RearMirror r2 = new RearMirror(90, 40);

        // Konstruktor der Cars-Klasse erfordert mehr Parameter
        Cars c1 = new Cars(e1, "red", "123ABC", 50, 5); // Beispielwerte für carSerialNumber und fuelAmount
        c1.addMirror(r1);
        c1.addMirror(r2);

        // Ausgabe der Position des ersten Rückspiegels und der PS des Motors
        System.out.println(c1.getMirrors().get(0).getPosition());
        System.out.println(c1.getengine().getHorsePower());

        /*
        // Auskommentierter Code muss überprüft werden, da die Methoden wie doBreak(), turboBoost() und andere fehlen
        Cars c1 = new Cars(8, "grey", "BEZAUI", 80);
        c1.setFuelAmount(80);
        System.out.println("Kraftstoffstand c1: " + c1.getFuelAmount());

        c1.doBreak();
        c1.turboBoost();
        c1.amountOfRepetitions(3);
        System.out.println("Verbleibende Reichweite c1: " + c1.getRemainingRange());

        Cars c2 = new Cars(17, "red", "1234", 50);
        System.out.println("Farbe von c2: " + c2.getCarColor());
        System.out.println("Seriennummer von c2: " + c2.getCarSerialNumber());
        c2.drive();
        System.out.println("Kraftstoffstand c2 nach Fahrt: " + c2.getFuelAmount());
        */
    }
}
