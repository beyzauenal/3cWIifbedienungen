package at.beyza.projects.basics.IsAvsHasAbeziehung;

public class Dog extends Animal{
    public Dog(int weight, int height) {
        super(height, weight);
    }

    public void bark(){
        System.out.println("wuffwufwuf");
    }
}
