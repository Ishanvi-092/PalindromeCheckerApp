import java.util.*;
public class PalindromeCheckerApp {
    /**
     * Application entry point for UC7.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
                // Define the input string to validate
                String input = "refer";

                // Create a Queue to store characters in FIFO order
                Deque<Character> deque = new ArrayDeque<>();

                // Insert each character into both queue and stack
                for (char c : input.toCharArray()) {
                    deque.add(c);
                }

                // Flag to track palindrome status
                boolean isPalindrome = true;

                // Compare characters until the queue becomes empty
                while (deque.size() > 1) {
                    if (deque.removeFirst() != deque.removeLast()) {
                        isPalindrome = false;
                        break;
                    }
                }
                // Output result
                System.out.println("Input : " + input);
                System.out.println("Is Palindrome? : " + isPalindrome);
            }
        }



