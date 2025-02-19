package at.beyza.projects.basics.ooEinstieg;

public class Truck extends Car {
    private String trailer;

    public Truck(engine engine, String brand, String colour, String trailer) {
        super(engine, brand, colour, 50, 5);
        this.trailer = trailer;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;

    }

    @Override
    public void drive(int speed) {
        System.out.println("I am driving the truck = consuption is high");
        // super.drive();

    }

}
