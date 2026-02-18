import java.util.Stack;
public class PalindromeCheckerApp {
    /**
     * Application entry point for UC5.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String input = "noon";

                Stack<Character> stack = new Stack<>();
                for (char c : input.toCharArray()) {
                    stack.push(c);
                }
                boolean isPalindrome = true;
                for (char c : input.toCharArray()) {
                    if (c != stack.pop()) {
                        isPalindrome = false;
                        break;
                    }
                }
                if (isPalindrome) {
                    System.out.println(input + " is a palindrome.");
                } else {
                    System.out.println(input + " is NOT a palindrome.");
                }
            }
        }


