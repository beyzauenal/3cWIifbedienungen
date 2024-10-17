package strings;

import java.util.Random;
import java.util.Scanner;

public class Wörterraten {
    public static void main(String[] args) {
        String[] woerter = {"Cäsar", "Programm", "Java", "Maus", "Auto"};
        Random random = new Random();
        String geheimWort = woerter[random.nextInt(woerter.length)];
        String output = "";

        for (int i = 0; i < geheimWort.length(); i++) {
            output += "*";
        }

        Scanner scanner = new Scanner(System.in);
        int versuche = 5;

        while (versuche > 0 && output.contains("*")) {
            System.out.println("Das Wort: " + output);
            System.out.print("Welcher Buchstabe im Gesuchtem Wort ");
            char buchstabe = scanner.next().charAt(0);

            boolean gefunden = false;
            for (int i = 0; i < geheimWort.length(); i++) {
                if (geheimWort.charAt(i) == buchstabe) {
                    output = output.substring(0, i) + buchstabe + output.substring(i + 1);
                    gefunden = true;
                }
            }

            if (!gefunden) {
                versuche--;
                System.out.println("Falsch! Verbleibende Versuche: " + versuche);
            }
        }

        if (output.contains("*")) {
            System.out.println("Das Wort war: " + geheimWort);
        } else {
            System.out.println("Herzlichen Glückwunsch! Du hast das Wort erraten: " + output);
        }
        scanner.close();
    }
}
