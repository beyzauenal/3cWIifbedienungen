package at.beyza.projects.basics.IsAvsHasAbeziehung;

public class Animal {
    private int weight;
    private int height;

    public Animal(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
