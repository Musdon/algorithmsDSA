package linkedlist.mylinkedlist;

import java.util.HashSet;

public class LinkedListQuestions {
    //Delete duplicates
    void deleteDups(MyLinkedList ll){
        HashSet<Integer> hs = new HashSet<>();
        Node current = ll.head;
        Node prev = null;
        while (current!= null){
            int currentValue = current.value;
            if (hs.contains(currentValue)){
                prev.next = current.next;
                ll.size--;
            } else {
                hs.add(currentValue);
                prev = current;
            }
            current = current.next;
        }
    }

    //Nth to last
    Node nthToLast(MyLinkedList ll, int n){
        Node p1 = ll.head;
        Node p2 = ll.head;
        for (int i=0; i<n; i++){
            if (p2 == null){
                return null;
            }
            p2 = p2.next;
        }
        while (p2 != null){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }

    MyLinkedList partition(MyLinkedList ll, int x){
        Node currentNode = ll.head;
        ll.tail = ll.head;
        while (currentNode != null){
            Node next = currentNode.next;
            if (currentNode.value<x){
                currentNode.next = ll.head;
                ll.head = currentNode;
            } else {
                ll.tail.next = currentNode;
                ll.tail = currentNode;
            }
            currentNode = next;
        }
        ll.tail.next = null;
        return ll;
    }

    //Question 4 - sum lists
    MyLinkedList sumLists(MyLinkedList llA, MyLinkedList llB){
        //create 2 nodes
        Node n1 = llA.head;
        Node n2 = llB.head;
        int carry = 0;
        MyLinkedList resultLL = new MyLinkedList();
        while (n1 != null || n2 != null){
            int result = carry;
            if (n1 != null){
                result += n1.value;
                n1 = n1.next;
            }
            if (n2!=null){
                result += n2.value;
                n2 = n2.next;
            }
            resultLL.insertNode(result%10);
            carry = result/10;
        }
        return resultLL;
    }

    //Question 5 - intersection get kth node

    Node getKthNode(Node head, int k){
        Node current = head;
        while (k>0 && current != null){
            current = current.next;
            k--;
        }
        return current;
    }
    //Intersection Method
    Node findIntersection(MyLinkedList list1, MyLinkedList list2){
        if (list1.head == null || list2.head == null){
            return null;
        }
        if (list1.tail != list2.tail){
            return null;
        }
        Node shorter = new Node();
        Node longer = new Node();
        if (list1.size > list2.size){
            longer = list1.head;
            shorter = list2.head;
        } else {
            longer = list2.head;
            shorter = list1.head;
        }
        longer = getKthNode(longer, Math.abs(list1.size- list2.size));
        while (shorter != longer){
            shorter = shorter.next;
            longer = longer.next;
        }
        return longer;
    }
    //Add same node
    void addSameNode(MyLinkedList llA, MyLinkedList llB, int nodeValue){
        Node newNode = new Node();
        newNode.value = nodeValue;
        llA.tail.next = newNode;
        llA.tail = newNode;
        llB.tail.next = newNode;
        llB.tail = newNode;

    }

    public static void main(String[] args) {
        LinkedListQuestions llq = new LinkedListQuestions();

    }
}
