package at.beyza.projects.basics.OO;

public class ErsteObjekt {
    public static void main(String[] args) {
        // Erstellen eines Car-Objekts
        Cars c1 = new Cars(8, "grey", "BEZAUI", 80);
        c1.setFuelAmount(80);  // Kraftstoffmenge setzen

        System.out.println(c1.getFuelAmount());  // Aktuellen Kraftstoffstand ausgeben

        c1.doBreak();
        c1.turboBoost();
        c1.amountOfRepetitions(3);
        c1.getRemainingRange();  // Methode korrekt aufrufen

        // Zweites Auto
        Cars c2 = new Cars(17, "red", "1234", 50);

        System.out.println(c2.getCarColor());  // c1 auf c2 ändern, da c2 instanziiert wurde

        System.out.println(c2.getCarSerialNumber());
        c2.drive();
        System.out.println(c2.getFuelAmount());
    }
}
