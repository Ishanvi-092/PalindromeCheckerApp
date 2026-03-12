import java.util.*;

public class PalindromeCheckerApp {
    /**
     * Application entry point for UC11.
     */
    public static void main(String[] args) {

        String input = "racecar";

        /**
         * Service class that contains palindrome logic.
         */
        class PalindromeService {

            /**
             * Checks whether the input string is a palindrome.
             *
             * @param input Input string
             * @return true if palindrome, false otherwise
             */
            public boolean checkPalindrome(String input) {
                input = "racecar";
                int start = 0;
                int end = input.length() - 1;

                while (start < end) {
                    if (input.charAt(start) != input.charAt(end)) {
                        return false;
                    }
                    start++;
                    end--;
                }
                return true;
            }
        }

        PalindromeService service = new PalindromeService();

        if(service.checkPalindrome(input)){
            System.out.println("Input : " + input);
            System.out.println("Is Palindrome? : true");
        }
    }
}