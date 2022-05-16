package stack;

import linkedlist.SingLinkedList;
import linkedlist.mylinkedlist.MyLinkedList;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class StackWithLinkedList {
    SingLinkedList linkedList;

    //instantiate linkedlist in constructor
    public StackWithLinkedList(){
        linkedList = new SingLinkedList();
    }

    //push method
    public void push(int value){
        //insert at the beginning
        linkedList.insertInLinkedList(value, 0);
        System.out.println("Inserted " + value + " in stack");
    }

    public boolean isEmpty(){
        if (linkedList.head == null){
            return true;
        }
        return false;
    }

    public int pop(){
        int result = -1;
        if (isEmpty()){
            System.out.println("The stack is empty");
        }
        else {
            result = linkedList.head.value;
            linkedList.deletionOfNode(0);
        }
        return result;

    }

    public int peek(){
        int result = -1;
        if (isEmpty()){
            System.out.println("The stack is empty");
        }
        else {
            result = linkedList.head.value;
        }
        return result;
    }

    public void delete(){
        linkedList.head = null;
        System.out.println("The stack has been successfully deleted");
    }

    public static void main(String[] args) {
        StackWithLinkedList newStack = new StackWithLinkedList();
        System.out.println(newStack.isEmpty());
        newStack.push(1);
        newStack.push(2);
        newStack.push(3);

        System.out.println(newStack.isEmpty());
        System.out.println(newStack.pop());
        System.out.println(newStack.peek());
        newStack.delete();
    }

}
