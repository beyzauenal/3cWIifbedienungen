package whileloop;

import java.util.Random;

public class whileaufgabe1done {
    public static void main(String[] args) {
        Random random = new Random();
        int summe = 0;

        while (true) {
            int zahl = 10 + random.nextInt(21);
            if (zahl == 15 || zahl == 25) {
                System.out.println("Programm beendet.");
                break;
            }
            summe += zahl;
        }

        System.out.println("Summe der vorherigen Zufallszahlen: " + summe);
    }
}



