package org.example;
import java.util.*;

public class MinimumStack {
    private Stack<Integer> stack;

    public void MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        Stack<Integer> temp = new Stack<>();
        int minElement = stack.peek();

        while(!stack.isEmpty()){
            minElement = Math.min(minElement, stack.peek());
            temp.push(stack.pop());
        }

        while(!temp.isEmpty()){
            stack.push(temp.pop());
        }
        return minElement;
    }
}
