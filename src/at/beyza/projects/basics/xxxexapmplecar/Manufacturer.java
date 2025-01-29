package at.beyza.projects.basics.xxxexapmplecar;


public class Manufacturer {
    private String name;
    private String country;
    private double discountPercentage;

    // Hersteller
    public Manufacturer(String name, String country, double discountPercentage) {
        this.name = name;
        this.country = country;
        this.discountPercentage = discountPercentage;
    }

    // Rabattprozentsatz
    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }


    public String toString() {
        return "Manufacturer{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", discountPercentage=" + discountPercentage +
                "%}";
    }
}
