package at.beyza.projects.basics.ooEinstieg;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private List<Reifen> reifen;
    private engine engine;
    private List<RearMirror> mirrors;
    private final int fuelUsage;
    private final String carColor;
    private final String carSerialNumber;
    private int remainingRange;
    private int fuelAmount;
    private int amountOfRepetitions;

    public Car(engine engine, String carColor, String carSerialNumber, int fuelAmount, int fuelUsage) {
        this.engine = engine;
        this.fuelUsage = fuelUsage;
        this.carColor = carColor;
        this.carSerialNumber = carSerialNumber;
        this.fuelAmount = fuelAmount;
        this.amountOfRepetitions = 0; // Wiederholung
        this.remainingRange = calculateRemainingRange(); // Berechnung der Reichweite
        this.mirrors = new ArrayList<>();
        this.reifen = new ArrayList<>();  // Reifenliste initialisieren
    }

    // Getter und Setter für Engine
    public engine getEngine() {  // `engine` bleibt klein
        return engine;
    }

    public void setEngine(engine engine) {  // `engine` bleibt klein
        this.engine = engine;
    }

    // Getter für die Horsepower des Motors
    public int getHorsePower() {
        return engine.getHorsePower(); // Greift auf den Wert von horsePower in der engine-Klasse zu
    }

    //Methode drive für Truck
    public void drive(){
        System.out.println("I'm driving");
    }



    public void stop(){
        System.out.println("I'm breaking......car");
    }




    public void addMirror(RearMirror rearMirror) {
        this.mirrors.add(rearMirror);
    }

    public List<RearMirror> getMirrors() {
        return mirrors;
    }

    // Reifen Methode
    public void addReifen(Reifen reifen) {
        if (this.reifen.size() < 4) {  // Ein Auto kann nur 4 Reifen haben
            this.reifen.add(reifen);
        } else {
            System.out.println("Das Auto hat bereits 4 Reifen.");
        }
    }

    public List<Reifen> getReifen() {
        return reifen;
    }

    public void drive(int speed) {
        if (fuelAmount > 0) {
            fuelAmount -= fuelUsage; // Kraftstoff verbrauchen
            this.remainingRange = calculateRemainingRange(); // verbleibende Reichweite neu berechnen
            System.out.println("Das Auto fährt mit " + speed + " km/h.");
        } else {
            System.out.println("Nicht genug Kraftstoff!");
        }
    }

    public void doBreak() {
        System.out.println("Das Auto bremst.");
    }

    public void turboBoost() {
        if (fuelAmount > fuelUsage * 0.1) {
            System.out.println("SuperBoostMode");
        } else {
            System.out.println("Nicht genug Kraftstoff für SuperBoost.");
        }
    }

    public void amountOfRepetitions(int repetition) {
        this.amountOfRepetitions = repetition; // Wiederholungen
        for (int i = 0; i < repetition; i++) {
            System.out.println("Tututututuuuuu");
        }
    }

    public int getRemainingRange() {
        return remainingRange;
    }

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = Math.min(fuelAmount, 100);
        this.remainingRange = calculateRemainingRange(); // Berechnung nach Kraftstoff
    }

    public String getCarColor() {
        return carColor;
    }


    public String getCarSerialNumber() {
        return carSerialNumber;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    private int calculateRemainingRange() {
        if (fuelUsage > 0) {
            return fuelAmount / fuelUsage;
        }
        return 0; // Verhindert Division durch 0
    }
}
