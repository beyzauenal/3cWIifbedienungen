import java.util.Scanner;
public class bankomatdone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double kontostand = 0.0;

        while (true) {
            System.out.println("1. Einzahlen");
            System.out.println("2. Abheben");
            System.out.println("3. Kontostand anzeigen");
            System.out.println("4. Beenden");

            int auswahl = scanner.nextInt();

            if (auswahl == 1) {
                System.out.print("Betrag zum Einzahlen: ");
                double einzahlen = scanner.nextDouble();
                kontostand += einzahlen;
            } else if (auswahl == 2) {
                System.out.print("Betrag zum Abheben: ");
                double abheben = scanner.nextDouble();
                if (abheben <= kontostand) {
                    kontostand -= abheben;
                } else {
                    System.out.println("Nicht genug Guthaben.");
                }
            } else if (auswahl == 3) {
                System.out.println("Kontostand: " + kontostand + " Euro.");
            } else if (auswahl == 4) {
                System.out.println("Programm beendet.");
                break;
            } else {
                System.out.println("Ungültige Auswahl.");
            }
        }

        scanner.close();
    }
}
