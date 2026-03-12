import java.util.*;

public class PalindromeCheckerApp {
    /**
     * Application entry point for UC13
     * @param args Command-Line arguments
     */

    public static void main(String[] args) {

        String input = "level";

        long start = System.nanoTime();

        boolean isPalindrome = true;
        int startIndex = 0;
        int endIndex = input.length() - 1;

        while(startIndex < endIndex){
            if(input.charAt(startIndex) != input.charAt(endIndex)){
                isPalindrome = false;
                break;
            }
            startIndex++;
            endIndex--;
        }

        long end = System.nanoTime();
        long executionTime = end - start;

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("Execution Time : " + executionTime + " ns");
    }
}