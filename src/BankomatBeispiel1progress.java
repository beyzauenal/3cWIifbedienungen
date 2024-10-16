public class BankomatBeispiel1progress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double kontostand = 0;
        boolean beenden = false;


        while (!beenden) {
            // Menüoptionen anzeigen
            System.out.println("Willkommen beim Bankomat! Wählen Sie eine Option:");
            System.out.println("1. Einzahlen");
            System.out.println("2. Abheben");
            System.out.println("3. Kontostand anzeigen");
            System.out.println("4. Beenden");

            // Benutzerwahl einlesen
            int auswahl = scanner.nextInt();

            switch (auswahl) {
                case 1:
                    // Einzahlung durchführen
                    System.out.print("Geben Sie den Betrag ein, den Sie einzahlen möchten: ");
                    double einzahlung = scanner.nextDouble();
                    if (einzahlung > 0) {
                        kontostand += einzahlung;
                        System.out.println(einzahlung + " € wurden eingezahlt.");
                    } else {
                        System.out.println("Ungültiger Betrag.");
                    }
                    break;
                case 2:
          

