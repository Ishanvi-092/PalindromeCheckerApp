import java.util.*;
public class PalindromeCheckerApp {

    /**
     * Recursively checks whether a string is palindrome.
     * @param s     Input string
     * @param start Starting index
     * @param end   Ending index
     * @return true if palindrome, otherwise false
     */

    private static boolean check(String s, int start, int end) {

        if (start >= end) {
            return true;
        }

        // If characters don't match, not a palindrome
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        return check(s, start + 1, end - 1);
    }

    /**
     * Application entry point for UC9.
     */
    public static void main(String[] args) {

        // Define the input string
        String input = "level";

        // Call recursive function
        boolean isPalindrome = check(input, 0, input.length() - 1);

        // Output result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}