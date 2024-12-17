package at.beyza.projects.basics.ooEinstieg;

public class engine {
    public enum TYPE { DIESEL, GAS }
    private int horsePower;
    private TYPE type;

    public engine(int horsePower, TYPE type) {
        this.horsePower = horsePower;
        this.type = type;
    }

    /*
                Amount should be between 0 and 200
         */
    public void drive(int amount) {
        if (amount < 0 || amount > 200) {
            System.out.println("Invalid amount. It must be between 0 and 200.");
            return;
        }
        System.out.println("The motor is running with " + amount);
    }

    public TYPE getType() {
        return type;
    }

    public int getHorsePower() {
        return horsePower;
    }
}
