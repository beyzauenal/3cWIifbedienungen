package at.beyza.projects.basics.ooEinstieg.Kamera_17;

import java.time.LocalDate;

public class Camera {
    private String manufacturer;
    private String country;
    private SDCard sdCard;
    private String resolution;

    public Camera(String manufacturer, String country) {
        this.manufacturer = manufacturer;
        this.country = country;
        this.resolution = "medium";
    }

    public void insertSDCard(SDCard sdCard) {
        this.sdCard = sdCard;
    }

    public void setResolution(String resolution) {
        if (resolution.equals("small") || resolution.equals("medium") || resolution.equals("large")) {
            this.resolution = resolution;
        } else {
            System.out.println("medium");
        }
    }

    public void takePicture() {
        if (sdCard == null) {
            System.out.println("Fehler: Keine SD-Karte");
            return;
        }

        int photoSize = switch (resolution) {
            case "small" -> 2;
            case "medium" -> 4;
            case "large" -> 6;
            default -> 4;
        };

        if (sdCard.getAvailableSpace() >= photoSize) {
            String photoName = "Photo" + System.currentTimeMillis();
            String photoDate = LocalDate.now().toString();
            File newFile = new File(photoName, photoDate, photoSize);
            sdCard.storeFile(newFile);
            System.out.println("Foto gemacht." + photoName);
        } else {
            System.out.println("Warnung: Kein Speicherplatz");
        }
    }
}

