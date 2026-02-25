
public class UC11 {

    public static void main(String[] args) {

        PalindromeChecker1 checker = new PalindromeChecker1();

        String input = "madam";

        if (checker.checkPalindrome(input)) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is NOT a Palindrome");
        }
    }
}


class PalindromeChecker1 {


    public boolean checkPalindrome(String input) {

        if (input == null || input.length() == 0) {
            return false;
        }

        int start = 0;
        int end = input.length() - 1;

        // Compare characters moving inward
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