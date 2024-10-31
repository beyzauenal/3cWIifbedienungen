package at.beyza.projects.basics.codingGame;

import java.util.Scanner;

public class stringManipulation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine Zeichenkette ein:");
        String S = in.nextLine();
        char[] data = S.toCharArray();

        for (int i = 0; i < data.length; i++) {
            char c = Character.toUpperCase(data[i]); // Konvertiere zu Großbuchstaben für einheitliche Vergleiche
            if (c == 'O') {
                data[i] = '0';
            } else if (c == 'I') {
                data[i] = '1';
            } else if (c == 'Z') {
                data[i] = '2';
            } else if (c == 'E') {
                data[i] = '3';
            } else if (c == 'A') {
                data[i] = '4';
            } else if (c == 'S') {
                data[i] = '5';
            } else if (c == 'G') {
                data[i] = '6';
            } else if (c == 'T') {
                data[i] = '7';
            } else if (c == 'B') {
                data[i] = '8';
            } else if (c == 'Q') {
                data[i] = '9';
            }
        }

        System.out.println("Ausgabe: " + String.valueOf(data));
        in.close();
    }
}

