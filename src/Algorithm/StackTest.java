package Algorithm;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args){
        Stack<String> stack = new Stack<>();
        stack.push("A");
        stack.push("B");
        Boolean b = stack.isEmpty();
        System.out.println(stack.peek()); // B
        stack.pop();
    }
}
