package at.beyza.projects.basics.strings;

public class CäsarVerschlüsselungdone {
    public static void main(String[] args) {
        String result = encrypt("abc");
        System.out.println(result);

        String decryptedResult = decrypt(result);
        System.out.println(decryptedResult);
    }

    public static String encrypt(String data) {
        String result = "";
        int shift = 2;

        for (int i = 0; i < data.length(); i++) {
            char ch = (char) (data.charAt(i) + shift);
            result += ch;
        }

        return result;
    }

    public static String decrypt(String data) {
        String result = "";
        int shift = 2;

        for (int i = 0; i < data.length(); i++) {
            char ch = (char) (data.charAt(i) - shift);
            result += ch;
        }

        return result;
    }
}

