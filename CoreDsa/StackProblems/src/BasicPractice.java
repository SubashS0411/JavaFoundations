import java.util.Stack;

public class BasicPractice {
    public static void main(String[] args) {
        Stack<Character> stack=new Stack<>();
        stack.push('a');
        stack.push('b');
        System.out.println(stack);
        stack.peek();    // Looks at the top item without removing it (Returns 'B')
        stack.pop();     // Removes and returns the top item ('B' is gone)
        System.out.println(stack.isEmpty());
    }
}
