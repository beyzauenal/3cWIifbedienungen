package at.beyza.projects.basics.ooEinstieg.Kamera_17;

public class Phone {
    private String brand;
    private SimCard simCard;
    private PhoneFile phoneFile;

    public Phone(String brand) {
        this.brand = brand;
    }


    public void insertSimCard(SimCard simCard) {
        this.simCard = simCard;
    }

    public void insertPhoneFile(PhoneFile phoneFile) {
        this.phoneFile = phoneFile;
    }
}
