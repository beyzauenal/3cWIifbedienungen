package at.beyza.projects.basics.ooEinstieg.Kamera_17;

public class PhoneFile {
    private String fileName;
    private int size; // in GB

    public PhoneFile(String fileName, int size) {
        this.fileName = fileName;
        this.size = size;
    }


    public String getFileName() {
        return fileName;
    }

    public int getSize() {
        return size;
    }
}
