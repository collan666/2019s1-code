import java.util.Stack;
import java.util.EmptyStackException;

public class StackDemo {

    public static void t1() {
        Stack<String> stack = new Stack<String>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }

    public static void t2() {
        Stack<String> stack = new Stack<String>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        try {   // not actually a good idea
            while (true) {
                System.out.println(stack.pop());
            }
        } catch (EmptyStackException e) {
        }
    }

    public static void main(String[] args) {
        t1();
        t2();
    }
}
