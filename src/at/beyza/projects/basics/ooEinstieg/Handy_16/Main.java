package at.beyza.projects.basics.ooEinstieg.Handy_16;

public class Main {
    public static void main(String[] args) {
        Camera camera = new Camera("high");
        SimCard simCard = new SimCard("1234", "555-1234");
        SDCard sdCard = new SDCard(50);
        Phone phone = new Phone(camera, simCard, sdCard, "password");

        if (phone.login("password")) {
            phone.takePhoto();
            phone.displayFiles();

        }
    }
}