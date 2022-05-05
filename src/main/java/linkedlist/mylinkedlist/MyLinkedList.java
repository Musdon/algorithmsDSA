package linkedlist.mylinkedlist;

public class MyLinkedList {

    public Node head;
    public Node tail;
    public int size;

    public void createLinkedList(int nodeValue){
        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.next = null;
        head = newNode;
        tail = newNode;
        size =1;
    }

    public void insertNode(int nodeValue){
        if (head==null){
            createLinkedList(nodeValue);
            return;
        }
        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.next = null;
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void traversal(){
        Node tempNode = head;
        for (int i=0; i<size; i++){
            System.out.print(tempNode.value);
            if (i!=size-1){
                System.out.print(" -> ");
            }
            tempNode = tempNode.next;
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.createLinkedList(1);
        ll.insertNode(2);
        ll.insertNode(2);
        ll.insertNode(3);
        ll.insertNode(4);
        ll.insertNode(5);
        ll.traversal();
    }
}
