package at.beyza.projects.basics.IsAvsHasAbeziehung;

public class Animal {
    private int weigth;
    private int height;

    public Animal(int height, int weigth) {
        this.height = height;
        this.weigth = weigth;
    }

    public int getWeigth() {
        return weigth;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
