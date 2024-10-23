package at.beyza.projects.basics.switchstatement;

import java.util.Random; // Import der Random-Klasse

public class SwitchStatement1done {
    public static void main(String[] args) {
        // Erstelle eine Zufallszahl zwischen 5 und 10
        Random random = new Random(); // Erzeuge ein Random-Objekt
        int randomNumber = 5 + random.nextInt(6); // Zufallszahl zwischen 5 und 10

        // Gib die Zahl in Worten aus mit switch
        switch (randomNumber) {
            case 10:
                System.out.println("Ten");
                break;
            case 9:
                System.out.println("Nine");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("Unbekannte Zahl");
        }
    }
}
