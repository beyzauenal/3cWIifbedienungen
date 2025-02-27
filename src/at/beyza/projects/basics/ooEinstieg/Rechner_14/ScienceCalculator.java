package at.beyza.projects.basics.ooEinstieg.Rechner_14;

public class ScienceCalculator extends Calculator {
    public double sinus(int a) {
        double radians = Math.toRadians(a);
        return Math.sin(radians);
    }


    public double cosinus(int a) {
        double radians = Math.toRadians(a);
        return Math.cos(radians);
    }
}