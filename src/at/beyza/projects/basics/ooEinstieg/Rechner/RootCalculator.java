package at.beyza.projects.basics.ooEinstieg.Rechner;

public class RootCalculator extends Calculator {
    public double squareRoot(int a) {
        if (a < 0) {
            throw new ArithmeticException("Keine (-) Zahlen");
        }
        return Math.sqrt(a);
    }
}