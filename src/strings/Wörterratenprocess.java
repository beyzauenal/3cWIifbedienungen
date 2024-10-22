package strings;

import java.util.Random;
import java.util.Scanner;

public class Wörterratenprocess {
    public static void main(String[] args) {
        String[] woerter = {"Cäsar", "Programm", "Java", "Maus", "Auto"};
        Random random = new Random();
        String geheimWort = woerter[random.nextInt(woerter.length)];
        String output = "";

        for (int i = 0; i < geheimWort.length(); i++) {
            output += "*";
        }

