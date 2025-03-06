package at.beyza.projects.basics.ooEinstieg.Kamera_17;

public class Main {
    public static void main(String[] args) {
        Camera myCamera = new Camera("Canon", "Japan");
        Phone myPhone = new Phone("Iphone");
        SDCard mySDCard = new SDCard(16);

        myCamera.insertSDCard(mySDCard);
        myPhone.insertSDCard(mySDCard);

        myCamera.setResolution("large");
        myCamera.takePicture();
        myCamera.takePicture();

    }
}
