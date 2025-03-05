package at.beyza.projects.basics.ooEinstieg.Kamera_17;

public class Photo {
    private String name;
    private String date;
    private int size; // in GB

    public Photo(String name, String date, int size) {
        this.name = name;
        this.date = date;
        this.size = size;
    }


    public int getSize() {
        return size;
    }
}
