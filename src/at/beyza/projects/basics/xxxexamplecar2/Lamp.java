package at.beyza.projects.basics.xxxexamplecar2;

import java.util.ArrayList;
import java.util.List;

public class Lamp {
    private List<LightElement> lightElements;

    public Lamp() {
        lightElements = new ArrayList<>();
    }

    public void addLightElement(LightElement lightElement) {
        lightElements.add(lightElement);
    }

    public void turnAllOn() {
        for (LightElement element : lightElements) {
            element.turnOn();
        }
    }

    public double getOverallPowerUsage() {
        double totalPowerUsage = 0;
        for (LightElement element : lightElements) {
            totalPowerUsage += element.getPowerUsage();
        }
        return totalPowerUsage;
    }

    public void printNamesOfLightElements() {
        for (LightElement element : lightElements) {
            System.out.println(element.getName());
        }
    }
}
