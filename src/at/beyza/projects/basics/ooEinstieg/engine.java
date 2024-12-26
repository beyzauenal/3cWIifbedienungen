package at.beyza.projects.basics.ooEinstieg;

public class engine {
    public enum TYPE { DIESEL, GAS }

    private int horsePower;
    private TYPE type;

    public engine(int horsePower, TYPE type) {
        this.horsePower = horsePower;
        this.type = type;
    }

    public void drive(int speed) {
        if (speed < 1 || speed > 100) {
            System.out.println("Invalid speed. It must be between 1 and 100.");
            return;
        }
        System.out.println("The engine is running at " + speed + " km/h.");
    }

    public TYPE getType() {
        return type;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void setType(TYPE type) {
        this.type = type;
    }
}
