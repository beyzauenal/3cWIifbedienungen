package at.beyza.projects.basics.xxxexapmplecar;



public class Engine {
    private String type; // Diesel or Petrol
    private int power;

    public Engine(String type, int power) {
        this.type = type;
        this.power = power;
    }

    public String getType() {
        return type;
    }

    public int getPower() {
        return power;
    }
}
