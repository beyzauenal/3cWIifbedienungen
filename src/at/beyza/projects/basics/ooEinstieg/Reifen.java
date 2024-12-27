package at.beyza.projects.basics.ooEinstieg;

public class Reifen {
    private int size;        // Größe des Reifens
    private String type;     // Typ des Reifens (z. B. Sommer, Winter)

    public Reifen(int size, String type) {
        this.size = size;
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void checkReifen() {
        System.out.println("Der Reifen ist in gutem Zustand.");
    }
}
