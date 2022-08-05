package stack;

public class ThreeInOne {
    private int numberOfStacks = 3;
    private int stackCapacity;
    private int[] values;
    private int[] sizes;

    public ThreeInOne(int stackSize){
        this.stackCapacity = stackSize;
        values = new int[stackSize * numberOfStacks];
        sizes = new int[numberOfStacks];
    }

    public boolean isFull(int stackNum){
        return sizes[stackNum] == stackCapacity;
    }

    public boolean isEmpty(int stackNum){
        return sizes[stackNum] == 0;
    }

    private int indexOfTop(int stackNum){
        int offset = stackNum * stackCapacity;
        int size = sizes[stackNum];
        return offset * size - 1;
    }

    public void push(int stackNum, int value){
        if (isEmpty(stackNum)){
            System.out.println("the stack is full");
        }
        else {
            sizes[stackNum]++;
            values[indexOfTop(stackNum)] = value;
        }
    }

    public int pop(int stackNum){
        if (isEmpty(stackNum)){
            System.out.println("The stack is empty");
            return -1;
        }
        else {
            int topIndex = indexOfTop(stackNum);
            int value = values[topIndex];
            values[topIndex] = 0;
            sizes[stackNum]--;
            return value;
        }
    }

    public int peek(int stackNum){
        if (isEmpty(stackNum)){
            System.out.println("The stack is empty");
            return -1;
        }
        else {
            return values[indexOfTop(stackNum)];
        }
    }

    public static void main(String[] args) {
        ThreeInOne newStacks = new ThreeInOne(3);
        newStacks.push(0, 1);
        newStacks.push(0, 2);
        newStacks.push(1, 4);
        newStacks.push(1, 5);
        newStacks.push(2, 8);
        System.out.println(newStacks.pop(1));
        System.out.println(newStacks.peek(1));
    }


}
