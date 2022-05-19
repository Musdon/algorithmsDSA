package circularQueueWithArray;

public class CircularQueueWithArray {

    int[] arr;
    int topOfQueue;
    int beginningOfQueue;
    int size;

    public CircularQueueWithArray(int size){
        this.arr = new int[size];
        this.size = size;
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
        System.out.println("The circular queue is successfully created with size of: " + size);
    }

    public boolean isEmpty(){
        return topOfQueue == -1 || beginningOfQueue == -1;
    }

    public boolean isFull(){
        if (topOfQueue+1 == beginningOfQueue){
            return true;
        } else return beginningOfQueue == 0 && topOfQueue + 1 == size;
    }

    public void enQueue(int value){
        if (isFull()){
            System.out.println("The CQ is full");
        } else if (isEmpty()){
            beginningOfQueue = 0;
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted " + value + " in the CQ");
        }
        else {
            if (topOfQueue+1 == size){
                topOfQueue =0;
            }
            else {
                topOfQueue++;
            }
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted " + value + " in the CQ");

        }
    }

    public int dequeue(){
        if (isEmpty()){
            System.out.println("The CQ is empty");
            return -1;
        }
        else {
            int result = arr[beginningOfQueue];
            arr[beginningOfQueue] = 0;
            if (beginningOfQueue == topOfQueue){
                beginningOfQueue = topOfQueue = -1;
            } else if (beginningOfQueue + 1 == size){
                beginningOfQueue = 0;
            } else {
                beginningOfQueue++;
            }
            return result;
        }
    }

    public int peek(){
        if (isEmpty()){
            System.out.println("The CQ is empty");
            return -1;
        }
        return arr[beginningOfQueue];
    }

    public void delete(){
        this.arr = null;
        System.out.println("The queue has been successfully deleted");
    }



    public static void main(String[] args) {
        CircularQueueWithArray newCircularQueue = new CircularQueueWithArray(3);
        System.out.println(newCircularQueue.isEmpty());
        System.out.println(newCircularQueue.isFull());
        newCircularQueue.enQueue(1);
        newCircularQueue.enQueue(2);
        newCircularQueue.enQueue(3);
        newCircularQueue.enQueue(4);
        System.out.println(newCircularQueue.peek());
        System.out.println(newCircularQueue.dequeue());
        newCircularQueue.delete();
    }


}
