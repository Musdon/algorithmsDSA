package linkedlist;

import java.util.LinkedList;

public class SingLinkedList {

    public static void main(String[] args) {
        SingLinkedList sll = new SingLinkedList();
        sll.createSinglyLinkedList(5);
        System.out.println(sll.head.value);
        sll.insertInLinkedList(2, 0);
        sll.insertInLinkedList(6, 3);
        sll.insertInLinkedList(8, 4);
        sll.insertInLinkedList(9, 5);
        sll.traverseSinglyLinkedList();
        System.out.println(sll.head.value);
        System.out.println(sll.head.next.next.value);
        sll.searchNode(5);
        sll.searchNode(10);
    }

    /**
     *Create head and tail, initialize to null
     *Create a blank node and assign a value to it, reference it to null
     * Link head and tail with these nodes
     */
    public Node head;
    public Node tail;
    public int size;


    public Node createSinglyLinkedList(int nodeValue){
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        return head;
    }

    //Insertion into singly linked list
    public void insertInLinkedList(int nodeValue, int location){
        Node node = new Node();
        node.value = nodeValue;
        if (head==null){
            createSinglyLinkedList(nodeValue);
            return;
        } else if (location==0){
            node.next = head;
            head = node;
        } else if (location>=size){
            node.next=null;
            tail.next = node;
            tail = node;
        } else {
            Node tempNode = head;
            int index =0;
            while (index<location-1){
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }

    //Traversing singly linked list
    public void traverseSinglyLinkedList(){
        if (head==null){
            System.out.println("SLL does not exist");
        } else {
            Node tempNode = head;
            for (int i=0; i<size; i++){
                System.out.print(tempNode.value);
                if (i != size-1){
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("\n");
    }

    //Search in singly linked list
    boolean searchNode(int nodeValue){
        if (head != null){
            Node tempNode = head;
            for (int i=0; i<size; i++){
                if (tempNode.value==nodeValue){
                    System.out.print("Found the node at location: " + i + "\n");
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found!");
        return false;
    }

    public void deletionOfNode(int location){
        if (head==null){
            System.out.println("The sll does not exist");
            return;
        } else if (location==0){
            //deleting the first element
            head = head.next;
            size--;
            if (size==0){
                tail = null;
            }
        } else if (location>=size){
            Node tempNode = head;
            for (int i=0; i<size-1; i++){
                tempNode = tempNode.next;
            }
            if (tempNode == head){
                tail = head = null;
                size--;
                return;
            }
            tempNode.next = null;
            tail = tempNode;
            size--;
        } else {
            Node tempNode = head;
            for (int i=0; i<location-1; i++){
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }

    public void deleteSLL(){
        head = null;
        tail = null;
        System.out.println("The sll deleted successfully");
    }
}
