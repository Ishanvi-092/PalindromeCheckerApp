import java.util.*;
public class PalindromeCheckerApp {
    /**
     * Application entry point for UC8.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
                // Define the input string to validate
                String input = "level";

                LinkedList<Character> list = new LinkedList<>();

                for (char c : input.toCharArray()) {
                    list.add(c);
                }

                // Flag to track palindrome status
                boolean isPalindrome = true;

                while (list.size() > 1) {
                    if (list.removeFirst() != list.removeLast()) {
                        isPalindrome = false;
                        break;
                    }
                }
                // Output result
                System.out.println("Input : " + input);
                System.out.println("Is Palindrome? : " + isPalindrome);
            }
        }



