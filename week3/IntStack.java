import java.util.Stack;
import java.util.EmptyStackException;

public class IntStack {

    public static void t1() {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(new Integer(1));
        stack.push(new Integer(2));
        stack.push(new Integer(3));
        while (!stack.empty()) {
            System.out.println(stack.pop().intValue());
        }
    }

    public static void t2() {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        int total = 0;
        while (!stack.empty()) {
            total += stack.peek();
            System.out.println(stack.pop());
        }
        System.out.println(total);
    }

    public static void main(String[] args) {
        t1();
        t2();
    }
}
