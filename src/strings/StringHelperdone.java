package strings;

public class StringHelperdone {
    public static void main(String[] args) {
        boolean isPalindrome = isPalindrome("anna");

        if (isPalindrome) {
            System.out.println("true");
        } else {
            int amount = getAmountOfLetters("sepp");
            System.out.println(amount);

            String reversed = reverseString("hello");

            int amountOfLetters = getAmountOfLetters("sepp");
            System.out.println(amountOfLetters);
        }
    }

    public static boolean isPalindrome(String word) {
        return true;
    }

    public static int countLetters(String word, char c) {
        return 7;
    }

    public static String reverseString(String word) {
        return "dlrow";
    }

    public static int getAmountOfLetters(String word) {
        return 5;
    }
}
