package stack;

import java.util.ArrayList;
import java.util.Stack;

public class SetOfStacks {

    private ArrayList<Stack<Integer>> stacks = new ArrayList<>();
    private int threshold;

    public SetOfStacks(int threshold){
        this.threshold = threshold;
        stacks.add(new Stack<>());
        System.out.println("Stack is initialized");
    }

    public void push(int element){
        Stack<Integer> lastStack = getLastStack();
        if (lastStack.size()== threshold){
            lastStack = new Stack<>();
            stacks.add(lastStack);
        }
        lastStack.push(element);
    }

    public Stack<Integer> getLastStack(){
        int last = stacks.size() -1;
        return stacks.get(last);
    }

    public Integer pop(){
        Stack<Integer> lastStack = getLastStack();
        Integer result = lastStack.pop();
        if (lastStack.size() == 0){
            stacks.remove(lastStack);
        }
        return result;
    }

    public Integer Peek(){
        Stack<Integer> lastStack = getLastStack();
        return lastStack.get(lastStack.size()-1);
    }
}
