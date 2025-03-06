package at.beyza.projects.basics.ooEinstieg.Kamera_17;

import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private int capacity; // in GB
    private int usedSpace = 0;
    private List<File> files;

    public SDCard(int capacity) {
        this.capacity = capacity;
        this.files = new ArrayList<>();
    }

    public int getAvailableSpace() {
        return capacity - usedSpace;
    }

    public void storeFile(File file) {
        if (getAvailableSpace() >= file.getSize()) {
            files.add(file);
            usedSpace += file.getSize();
            System.out.println("saved" + file.getName());
        } else {
            System.out.println("Fehler: nicht genug Speicher");
        }
    }
}
