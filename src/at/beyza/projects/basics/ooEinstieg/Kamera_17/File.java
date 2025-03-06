package at.beyza.projects.basics.ooEinstieg.Kamera_17;

public class File {
    private String name;
    private String date;
    private int size;

    public File(String name, String date, int size) {
        this.name = name;
        this.date = date;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }
}
