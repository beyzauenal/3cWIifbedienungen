package at.beyza.projects.basics.xxxexamplecar2;


public class LightElement {
    private String name;
    private String color;
    private double powerUsage;
    private boolean isOn;

    public LightElement(String name, String color, double powerUsage) {
        this.name = name;
        this.color = color;
        this.powerUsage = powerUsage;
        this.isOn = false;
    }

    public void turnOn() {
        if (isOn) {
            System.out.println("Mein Name ist " + name + ". Ich bin bereits eingeschaltet");
        } else {
            isOn = true;
            powerUsage += 5;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPowerUsage() {
        return powerUsage;
    }

    public void setPowerUsage(double powerUsage) {
        this.powerUsage = powerUsage;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }
}
