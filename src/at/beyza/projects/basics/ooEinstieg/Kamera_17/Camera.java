package at.beyza.projects.basics.ooEinstieg.Kamera_17;

public class Camera {
    private String manufacturer;
    private String country;
    private SDCard sdCard;
    private String resolution;

    public Camera(String manufacturer, String country) {
        this.manufacturer = manufacturer;
        this.country = country;
        this.resolution = "medium"; // default resolution
    }

    public void insertSDCard(SDCard sdCard) {
        this.sdCard = sdCard;
    }



    public void setResolution(String resolution) {
        if (resolution.equals("small") || resolution.equals("medium") || resolution.equals("large")) {
            this.resolution = resolution;
        } else {
            System.out.println("Invalid resolution. Using default medium.");
            this.resolution = "medium"; // default resolution
        }
    }

    public void takePicture() {
        if (sdCard != null) {
            int photoSize = 0;
            switch (resolution) {
                case "small":
                    photoSize = 2; // GB
                    break;
                case "medium":
                    photoSize = 4; // GB
                    break;
                case "large":
                    photoSize = 6; // GB
                    break;
            }

            if (sdCard.getAvailableSpace() >= photoSize) {
                String photoName = "Photo_" + System.currentTimeMillis();
                String photoDate = java.time.LocalDate.now().toString();
                sdCard.storePhoto(new Photo(photoName, photoDate, photoSize));
                System.out.println("Photo taken: " + photoName);
            } else {
                System.out.println("Warning: Not enough space on SD card!");
            }
        } else {
            System.out.println("No SD card inserted!");
        }
    }
}
