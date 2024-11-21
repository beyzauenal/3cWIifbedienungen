public class ErweitereDasAuto {

    private double fuelLevel;
    private double tankVolume;

    public void doBreak() {
        System.out.println("Ich bremse");
    }

    public void turboBoost() {
        if (fuelLevel > 0.1 * tankVolume) {
            System.out.println("SuperBoostMode");
        } else {
            System.out.println("Not enough fuel to go to Superboost");
        }
    }
}

