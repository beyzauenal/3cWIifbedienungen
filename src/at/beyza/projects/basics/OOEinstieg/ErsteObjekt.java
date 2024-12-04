package at.beyza.projects.basics.OO;

public class ErsteObjekt {
    public static void main(String[] args) {

        int myNumber = 7;

        Cars c1 = new Cars(8, "grey", "BEZAUI", 80);

        c1.dobreak();
        c1.turboBoost();
        c1.amountOfRepetitions(3);
        c1.getRemainingRange();

        Cars c2 = new Cars(17, "open", "1234", 50);
        System.out.println(c2.getCarserialNumber());  // Verwende den Getter für carserialNumber

    }
}
