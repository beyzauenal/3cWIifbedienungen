package at.beyza.projects.basics.strings;

import java.util.Random;
import java.util.Scanner;

public class Wörterraten {
    public static void main(String[] args) {

        String[] woerter = {"Cäsar", "beyza", "uenal"};

        Random random = new Random();
        String zufall = woerter[random.nextInt(woerter.length)];
        char[] erratenesWort = new char[zufall.length()];

        for (int i = 0; i < erratenesWort.length; i++) {
            erratenesWort[i] = '*';
        }

        Scanner scanner = new Scanner(System.in);
        boolean raten = false;

        while (!raten) {
            System.out.println("Gesuchtes Wort: " + String.valueOf(erratenesWort));
            System.out.print("Gib einen Buchstaben ein: ");
            char eingabe = scanner.next().charAt(0);

            boolean buchstabeGefunden = false;
            for (int i = 0; i < zufall.length(); i++) {
                if (zufall.charAt(i) == eingabe) {
                    erratenesWort[i] = eingabe;
                    buchstabeGefunden = true;
                }
            }

            if (!buchstabeGefunden) {
                System.out.println("Der Buchstabe " + eingabe + " ist nicht im Wort.");
            }

            if (String.valueOf(erratenesWort).equals(zufall)) {
                raten = true;
                System.out.println("Herzlichen Glückwunsch! Du hast das Wort erraten: " + zufall);
            }
        }

        scanner.close();
    }
}
