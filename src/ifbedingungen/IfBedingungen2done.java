package ifbedingungen;

import java.util.Random;

public class IfBedingungen2done {
    public static void main(String[] args) {
        // Zufallszahlen erstellen zwischen 0-100
        Random random = new Random();
        int randomnumber = random.nextInt(100);

        // Gib die Zufallszahl aus
        System.out.println(randomnumber);

        // Wenn die Zahl kleiner ist als 20, gib "Mini" aus
        // Wenn die Zahl zwischen 20 und 50 ist, gib "Medium" aus
        // Wenn die Zahl größer als 50 ist, gib "Large" aus
        if (randomnumber < 20) {
            System.out.println("Mini");
        } else if (randomnumber >= 20 && randomnumber <= 50) {
            System.out.println("Medium");

        } else {
            System.out.println("Large");
        }
    }
}
