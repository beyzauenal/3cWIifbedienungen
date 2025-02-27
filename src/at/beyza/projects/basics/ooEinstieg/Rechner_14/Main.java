package at.beyza.projects.basics.ooEinstieg.Rechner_14;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.add(5, 7);
        System.out.println(result);

        ScienceCalculator scienceCalculator = new ScienceCalculator();
        double result2 = scienceCalculator.sinus(7);
        System.out.println(result2);
    }
}