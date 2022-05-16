package queueArray;

public class QueueArray {
    int[] arr;
    int topOfQueue;
    int beginningOfQueue;

    public QueueArray(int size){
        this.arr = new int[size];
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
        //Creating a queue takes O(1) complexity while space complexity is O(n)
        System.out.println("The queue is successfully created with size " + size);
    }

    public boolean isFull(){
        return topOfQueue == arr.length - 1;
    }

    public boolean isEmpty(){
        return beginningOfQueue == -1 || beginningOfQueue == arr.length;
    }

    public void enQueue(int value){
        if (isFull()){
            System.out.println("The queue is full");
        }
        else if (isEmpty()){
            beginningOfQueue = 0;
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println(value + " is successfully inserted in the queue");
        } else {
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println(value + " is successfully inserted in the queue");
        }
    }

    public int deQueue(){
        if (isEmpty()){
            System.out.println("The queue is empty");
            return -1;
        }
        else {
            int result = arr[beginningOfQueue];
            beginningOfQueue++;
            if (beginningOfQueue > topOfQueue){
                beginningOfQueue = -1;
                topOfQueue = -1;
            }
            return result;
        }
    }

    public int peek(){
        if (isEmpty()){
            System.out.println("The queue is currently empty");
            return -1;
        }
        else {
            return arr[beginningOfQueue];
        }

    }

    public void deleteQueue(){
        arr = null;
        System.out.println("The queue has been successfully deleted");
    }



    public static void main(String[] args) {
        QueueArray newQueue = new QueueArray(3);
        System.out.println(newQueue.isFull());
        System.out.println(newQueue.isEmpty());
        newQueue.enQueue(1);
        newQueue.enQueue(2);
        newQueue.enQueue(3);
        newQueue.enQueue(4);

        System.out.println(newQueue.deQueue());
        System.out.println(newQueue.peek());
        newQueue.deleteQueue();
    }
}
