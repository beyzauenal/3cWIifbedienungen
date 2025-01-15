package at.beyza.projects.basics.xxxexapmplecar;

public class Main {
    public static void main(String[] args) {
        Manufacturer vw = new Manufacturer("Volkswagen", "Germany", 10);
        Engine dieselEngine = new Engine("Diesel", 150);
        Car vwCar = new Car("Red", 220, 30000, 6.5, vw, dieselEngine);

        System.out.println("Auto-Details (Volkswagen):");
        System.out.println(vwCar);
        System.out.println("Verbrauch nach 60,000 km: " + vwCar.calculateConsumption(60000) + " L/100km\n");



        Manufacturer beyzaManufacturer = new Manufacturer("Beyza", "Austria", 15);
        Engine petrolEngine = new Engine("Petrol", 200);
        Car beyzaCar = new Car("Blue", 240, 35000, 7.0, beyzaManufacturer, petrolEngine);

        System.out.println("Auto-Details (Beyza):");
        System.out.println(beyzaCar);
        System.out.println("Verbrauch nach 60,000 km: " + beyzaCar.calculateConsumption(60000) + " L/100km");
    }
}

/// src/
//└── at/beyza/projects/basics/xxxexapmplecar/
//    ├── Manufacturer.java
//    ├── Engine.java
//    ├── Car.java
//    └── Main.java