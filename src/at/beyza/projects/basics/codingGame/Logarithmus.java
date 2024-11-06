package at.beyza.projects.basics.codingGame;

import java.util.Scanner;

public class Logarithmus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int Y = in.nextInt();
        int N = in.nextInt();

        double result = Math.log(Y) / Math.log(N);

        System.out.println((int) result);

        in.close();
    }
}


