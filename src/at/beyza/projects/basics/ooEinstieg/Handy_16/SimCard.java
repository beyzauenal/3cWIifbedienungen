package at.beyza.projects.basics.ooEinstieg.Handy_16;

public class SimCard {
    private String id;
    private String phoneNumber;

    public SimCard(String id, String phoneNumber) {
        this.id = id;
        this.phoneNumber = phoneNumber;
    }

    public String getId() {
        return id;
    }

    public String getPhoneNumber() {
        return phoneNumber;

    }
}