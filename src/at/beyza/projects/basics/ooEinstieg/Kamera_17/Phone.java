package at.beyza.projects.basics.ooEinstieg.Kamera_17;

public class Phone {
    private String brand;
    private SDCard sdCard;

    public Phone(String brand) {
        this.brand = brand;
    }

    public void insertSDCard(SDCard sdCard) {
        this.sdCard = sdCard;
    }

    public void saveFile(File file) {
        if (sdCard != null) {
            sdCard.storeFile(file);
        } else {
            System.out.println("Keine SD-Karte im Telefon.");
        }
    }
}
