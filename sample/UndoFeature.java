import java.util.*;
public class UndoFeature {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        // Push 3 actions into the stack
        stack.push("write");
        stack.push("delete");
        stack.push("insert");

        System.out.println("The Actions in the stack are: " + stack);
        System.out.println("The size of the stack is: " + stack.size());
        // Show the last action using peek
        System.out.println("The Last action contained in the stack is: " + stack.peek());

        // Undo 2 actions (pop).
        stack.pop();
        stack.pop();
        System.out.println("After Undo, The remaining actions in the stack are: " + stack);

    }
}
