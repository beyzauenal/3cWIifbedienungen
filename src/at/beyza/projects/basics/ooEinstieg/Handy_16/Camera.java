package at.beyza.projects.basics.ooEinstieg.Handy_16;

public class Camera {
    private String resolution;

    public Camera(String resolution) {
        this.resolution = resolution;
    }

    public File capturePhoto() {
        int fileSize = getFileSize();
        return new File("Photo", fileSize);
    }

    public int getFileSize() {
        switch (resolution) {
            case "high":
                return 10;
            case "medium":
                return 5;
            case "low":
                return 2;
            default:
                return 0;

        }
    }
}
