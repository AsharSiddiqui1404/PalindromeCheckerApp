public class UC13 {


    public static void main(String[] args) {

        String input = "level";

        System.out.println("Input : " + input);
        System.out.println("--------------------------------");

        long startTime1 = System.nanoTime();
        boolean result1 = isPalindromeReverse(input);
        long endTime1 = System.nanoTime();
        long executionTime1 = endTime1 - startTime1;

        long startTime2 = System.nanoTime();
        boolean result2 = isPalindromeTwoPointer(input);
        long endTime2 = System.nanoTime();
        long executionTime2 = endTime2 - startTime2;

        System.out.println("Algorithm 1 (Reverse Method): " + result1);
        System.out.println("Execution Time: " + executionTime1 + " ns");
        System.out.println();

        System.out.println("Algorithm 2 (Two Pointer Method): " + result2);
        System.out.println("Execution Time: " + executionTime2 + " ns");
    }

    private static boolean isPalindromeReverse(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    private static boolean isPalindromeTwoPointer(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
