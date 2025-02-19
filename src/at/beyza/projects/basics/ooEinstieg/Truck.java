package at.beyza.projects.basics.ooEinstieg;

public class Truck extends Car {
    private String trailer;

    public Truck(engine engine, String brand, String colour, String trailer) {
        super(engine, brand, colour, 50, 5); // Beispielwerte für carSerialNumber und fuelAmount
        this.trailer = trailer;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;

    }

    @Override
    public void drive("I'm driving the Truck; consuption is high"){
        //super.drive();
    }
}
