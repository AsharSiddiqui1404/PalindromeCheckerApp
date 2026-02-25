public class UC12 {

    public static void main(String[] args) {

        String input = "madam";

        // Inject strategy at runtime
        PalindromeStrategy strategy;

        // Change strategy here to switch algorithm
        strategy = new StackStrategy();
        // strategy = new DequeStrategy();

        boolean result = strategy.check(input);

        if (result) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is NOT a Palindrome");
        }
    }
}


interface PalindromeStrategy {
    boolean check(String input);
}


class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {

        if (input == null) return false;

        java.util.Stack<Character> stack = new java.util.Stack<>();

        // Push characters onto stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare by popping
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

class DequeStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {

        if (input == null) return false;

        java.util.Deque<Character> deque = new java.util.ArrayDeque<>();

        // Add characters to deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        // Compare from both ends
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}