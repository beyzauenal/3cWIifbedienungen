package at.beyza.projects.basics.OO;

public class ErsteObjekt {
    public static void main(String[] args) {
        // Wir bauen das erste Objekt: Ein Auto!
        // Ein Auto hat Eigenschaften (Farbe, Spritverbrauch, Seriennummer) und Fähigkeiten (fahren, bremsen).

        Cars c1 = new Cars();
        c1.carcolor = "grey";
        c1.carSpritverbrauch = 8;
        c1.carserialNumber = "BEZAUI";
        c1.fuelAmount = 80;

        c1.dobreak();
        c1.turboBoost();
        c1.amountOfRepetitions(3);
        c1.getRemainingRange();
    }
}
