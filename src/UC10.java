public class UC10 {

    public static boolean isPalindrome(String input) {

        // Step 1: Normalize string
        String normalized = input
                .toLowerCase()
                .replaceAll("[^a-z0-9]", "");

        // Step 2: Two-pointer check
        int left = 0;
        int right = normalized.length() - 1;

        while (left < right) {
            if (normalized.charAt(left) != normalized.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";

        if (isPalindrome(input)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}