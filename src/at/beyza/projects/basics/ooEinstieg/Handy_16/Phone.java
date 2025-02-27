package at.beyza.projects.basics.ooEinstieg.Handy_16;

import java.util.ArrayList;
import java.util.List;

public class Phone {
    private Camera camera;
    private SimCard simCard;
    private SDCard sdCard;
    private String login;

    public Phone(Camera camera, SimCard simCard, SDCard sdCard, String login) {
        this.camera = camera;
        this.simCard = simCard;
        this.sdCard = sdCard;
        this.login = login;
    }

    public void takePhoto() {
        if (sdCard.hasSpace(camera.getFileSize())) {
            File photo = camera.capturePhoto();
            sdCard.saveFile(photo);
        } else {
            System.out.println("Not enough space on SD card.");
        }
    }

    public void displayFiles() {
        sdCard.displayFiles();
    }

    public boolean login(String password) {
        return password.equals(this.login);
    }
}