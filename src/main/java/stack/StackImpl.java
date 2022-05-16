package stack;

public class StackImpl {
    int[] arr;
    int topOfStack;

    public StackImpl(int size){
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("The stack is created with size of: " +size);
    }

    public boolean isEmpty(){
        if (topOfStack == -1){
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if (topOfStack == arr.length-1){
            return true;
        }
        return false;
    }

    public void push(int value){
        if (isFull()){
            System.out.println("New values cannot be added as the stack is full");
        }
        else {
            arr[topOfStack+1] = value;
            topOfStack++;
            System.out.println(value + " has been successfully added");
        }
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("There's nothing in the stack");
            return -1;
        }
        else {
            int topElementInStack = arr[topOfStack-1];
            topOfStack--;
            return topElementInStack;

        }
    }

    public int peek(){
        if (isEmpty()){
            System.out.println("There's nothing in the stack");
            return -1;

        }
        return arr[topOfStack];
    }

    public void delete(){
        arr = null;
        System.out.println("The stack has been successfully deleted");
    }


    public static void main(String[] args) {
        StackImpl newStack = new StackImpl(4);
        System.out.println(newStack.isEmpty());
        System.out.println(newStack.isFull());
        newStack.push(1);
        newStack.push(2);
        newStack.push(3);
        newStack.push(4);
        newStack.push(5);

        System.out.println(newStack.pop());
        System.out.println(newStack.peek());
        newStack.delete();


    }


}
