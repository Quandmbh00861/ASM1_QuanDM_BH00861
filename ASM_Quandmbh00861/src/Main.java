import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Initialize the stack
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack after pushing elements: " + stack);

        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);

        System.out.println("Stack after pop: " + stack);

        int topElement = stack.peek();
        System.out.println("Top element using peek: " + topElement);


        boolean isEmpty = stack.isEmpty();
        System.out.println("Is the stack empty? " + isEmpty);
    }
}
