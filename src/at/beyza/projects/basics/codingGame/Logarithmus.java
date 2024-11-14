package at.beyza.projects.basics.codingGame;

import java.util.Scanner;

public class Logarithmus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int Y = in.nextInt();

        if (N > 0 && Y > 0) {
            double result = Math.log(Y) / Math.log(N);
            System.out.println((int) result);
        } else {
            System.out.println("N und Y müssen größer als 0 sein.");
        }

        in.close();
    }
}

