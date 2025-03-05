package at.beyza.projects.basics.ooEinstieg.Kamera_17;

public class SDCard {
    private int capacity; // in GB
    private int usedSpace = 0;

    public SDCard(int capacity) {
        this.capacity = capacity;
    }

    public int getAvailableSpace() {
        return capacity - usedSpace;
    }


    public void storePhoto(Photo photo) {
        if (getAvailableSpace() >= photo.getSize()) {
            usedSpace += photo.getSize();
        }
    }
}
