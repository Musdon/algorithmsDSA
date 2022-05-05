package stack;

public class StackImpl {
    int[] arr;
    int topOfStack;

    public StackImpl(int size){
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("The stack is created with size of: " +size);
    }

    //Is empty method
    public boolean isEmpty(){
        if (topOfStack == -1){
            return true;
        } else {
            return false;
        }
    }

    //is full method
    public boolean isFull(){
        if (topOfStack == arr.length-1){
            //System.out.println("The stack is full");
            return true;
        } else {
            return false;
        }
    }

    //push
    public void push(int value){
        if (isFull()){
            System.out.println("The stack is full");
        } else {
            arr[topOfStack+1] = value;
            topOfStack++;
            System.out.println("The value is successfully inserted");
        }
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
        //System.out.println(newStack.pop());
        System.out.println(newStack.peek());
        newStack.deleteStack();
        newStack.peek();
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("The stack is empty");
            return -1;
        } else {
            int topStack = arr[topOfStack];
            topOfStack--;
            return topStack;
        }

    }

    public int peek(){
        if (isEmpty()){
            System.out.println("The stack is empty");
            return -1;
        } else {
            return arr[topOfStack];
        }
    }

    public void deleteStack(){
        arr = null;
        System.out.println("The stack is successfully deleted");
    }
}
