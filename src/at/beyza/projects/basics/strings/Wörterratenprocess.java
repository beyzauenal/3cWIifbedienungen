package at.beyza.projects.basics.strings;

import java.util.Random;

public class Wörterratenprocess {
    public static void main(String[] args) {
        String[] woerter = {"Cäsar", "Programm "};
        Random random = new Random();
        String geheimWort = woerter[random.nextInt(woerter.length)];
        String output = "";

        for (int i = 0; i < geheimWort.length(); i++) {
            output += "";
        }
    }
}

