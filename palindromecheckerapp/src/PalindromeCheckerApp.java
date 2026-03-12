import java.util.*;

public class PalindromeCheckerApp {
    /**
     * Application entry point for UC9.
     */
    public static void main(String[] args) {

        // Define the input string
        String input = "A man a plan a canal Panama";

        // Normalize the string (remove spaces and convert to lowercase)
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        boolean isPalindrome = true;

        for (int i = 0; i < normalized.length() / 2; i++) {
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Output result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}