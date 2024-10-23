package at.beyza.projects.basics;

import java.util.Random;
import java.util.Scanner;

public class würfelspieldone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int spielerSumme = 0;
        int computerSumme = 0;

        System.out.println("Würfelspiel!");
        System.out.println("1. Spiel starten");
        System.out.println("2. Beenden");

        int auswahl = scanner.nextInt();

        if (auswahl == 1) {
            for (int i = 0; i < 6; i++) {
                int spielerWurf = 1 + random.nextInt(6);
                int computerWurf = 1 + random.nextInt(6);
                spielerSumme += spielerWurf;
                computerSumme += computerWurf;
                System.out.println("Dein Wurf: " + spielerWurf + ", Computer Wurf: " + computerWurf);
            }

            System.out.println("summe: " + spielerSumme);
            System.out.println("summe computer: " + computerSumme);

            if (spielerSumme > computerSumme) {
                System.out.println("gewonnen!");
            } else if (spielerSumme < computerSumme) {
                System.out.println("computer hat gewonnen!");
            } else {
                System.out.println("Unentschieden!");
            }
        } else {
            System.out.println("Spiel beendet.");
        }

        scanner.close();
    }
}
