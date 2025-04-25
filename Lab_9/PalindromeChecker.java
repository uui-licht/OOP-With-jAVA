public class PalindromeChecker {
    public static void checkPalindrome(String inputString) {
        String reversedString = "";
        for (int i = inputString.length() - 1; i >= 0; i--) {
            reversedString += inputString.charAt(i);
        }
        
        if (reversedString.equalsIgnoreCase(inputString)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }

    public static void main(String[] args) {
        checkPalindrome("OO");
    }
} 