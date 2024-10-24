package at.beyza.projects.basics.strings;

public class StringHelperdone {
    public static void main(String[] args) {
        boolean isPalindrome = isPalindrome("anna");

        if (isPalindrome) {
            System.out.println("true");
        } else {
            int amount = getAmountOfLetters("sepp");
            System.out.println(amount);

            String reversed = reverseString("hello");
            System.out.println(reversed);

            int amountOfLetters = getAmountOfLetters("sepp");
            System.out.println(amountOfLetters);
        }
    }

    public static boolean isPalindrome(String word) {
        String reversed = reverseString(word);
        return word.equals(reversed);  // Prüft, ob das Wort rückwärts gleich dem Original ist
    }

    public static int countLetters(String word, char c) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }

    public static String reverseString(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        return reversed;
    }

    public static int getAmountOfLetters(String word) {
        return word.length();  // Gibt die Anzahl der Buchstaben im Wort zurück
    }
}

