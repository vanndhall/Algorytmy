package Words;

public class PasswordBreaker {
    private final static String SECRET = "cbac";
    private final static char[] DICTIONARY = new char[]{'a', 'b', 'c'};
    private static boolean found = false;

    private static boolean checkPassword(String input) {
        System.out.println("Sprawdzenie słowa: "+input);
        return input.equals(SECRET);
    }

    private static void bruteForce(String input, int n) {
        // bruteForce - brutalna siła idziemy z łomem na to


            if (checkPassword(input)) {
                found = true;
                 System.out.println("Znalazłem hasło! " + input);
            } else {
                if (n != 0) {
                        for (char character : DICTIONARY) {
                            if(!found ) {
                            String newInput = input + character;
                            bruteForce(newInput, n - 1);
                        }
                    }
                }
            }
    }

    public static void main(String[] args) {
        bruteForce("", 4);
    }
}



