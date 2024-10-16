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
                    // Abhebung durchführen
                    System.out.print("Geben Sie den Betrag ein, den Sie abheben möchten: ");
                    double abhebung = scanner.nextDouble();
                    if (abhebung > 0 && abhebung <= kontostand) {
                        kontostand -= abhebung;
                        System.out.println(abhebung + " € wurden abgehoben.");
                    } else if (abhebung > kontostand) {
                        System.out.println("Unzureichender Kontostand.");
                    } else {
                        System.out.println("Ungültiger Betrag.");
                    }
                    break;
                case 3:
                    // Kontostand anzeigen
                    System.out.println("Ihr aktueller Kontostand ist: " + kontostand + " €");
                    break;
                case 4:
                    // Programm beenden
                    System.out.println("Vielen Dank für die Nutzung des Bankomaten. Auf Wiedersehen!");
                    beenden = true;
                    break;
                default:
                    System.out.println("Ungültige Auswahl. Bitte wählen Sie eine gültige Option.");
                    break;
            }
        }

        // Scanner schließen, um Ressourcen freizugeben
        scanner.close();
    }
}

