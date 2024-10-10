public class whileAufgabe1progress {
    public static void main(String[] args) {
        Random random = new Random(); // Random-Objekt wird erstellt
        int summe = 0; // Variable für die Summe
        int zahl; // Variable für die generierte Zufallszahl

        while (true) {
            zahl = 10 + random.nextInt(21); // Zufallszahl zwischen 10 und 30
            if (zahl == 15 || zahl == 25) {
                break; // Schleife beenden, wenn die Zahl 15 oder 25 ist
            }
            summe += zahl; // Zufallszahl zur Summe hinzufügen
            System.out.println("Zufallszahl: " + zahl + ", aktuelle Summe: " + summe);
        }

        System.out.println("Programm beendet! Die Summe der vorherigen Zufallszahlen ist: " + summe);
    }
}

