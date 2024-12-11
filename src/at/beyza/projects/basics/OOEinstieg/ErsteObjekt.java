package at.beyza.projects.basics.OO;

public class ErsteObjekt {
    public static void main(String[] args) {
        // Erstellen eines Car-Objekts
        Cars c1 = new Cars(8, "grey", "BEZAUI", 80);

        // Test der Methoden
        c1.dobreak();
        c1.turboBoost();
        c1.amountOfRepetitions(3);
        c1.getRemainingRange();

        // Erstellen eines weiteren Car-Objekts
        Cars c2 = new Cars(17, "red", "1234", 50);
     m   System.out.println("Serial Number of car 2: " + c2.getCarserialNumber()); // Ausgabe der Seriennummer
    }
}