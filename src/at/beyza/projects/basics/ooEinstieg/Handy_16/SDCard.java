package at.beyza.projects.basics.ooEinstieg.Handy_16;

import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private int totalSpace;
    private int usedSpace;
    private List<File> files;

    public SDCard(int totalSpace) {
        this.totalSpace = totalSpace;
        this.usedSpace = 0;
        this.files = new ArrayList<>();
    }

    public boolean hasSpace(int fileSize) {
        return (usedSpace + fileSize) <= totalSpace;
    }

    public void saveFile(File file) {
        if (hasSpace(file.getSize())) {
            files.add(file);
            usedSpace += file.getSize();
            System.out.println("File saved: " + file.getName());
        }
    }

    public void displayFiles() {
        if (files.isEmpty()) {
            System.out.println("No files on the SD card.");
        } else {
            for (File file : files) {
                System.out.println(file.getName() + " (" + file.getSize() + " MB)");

            }
        }
    }
}