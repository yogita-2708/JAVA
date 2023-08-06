   // Linked List implementation (Collection Framework)

//import java.util.*;
//import java.util.LinkedList;

/*class LinkedList {
    public static void main(String args[]) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("is");
        list.add("a");
        list.addLast("list");
        list.addFirst("this");
        list.add(3, "linked");
        System.out.println(list);

        System.out.println(list.get(0));
        System.out.println(list.size());
        list.remove(3);
        list.removeFirst();
        list.removeLast();

        System.out.println(list);
    }
}*/

// Scratch Implementation of Linked list

class LinkedList {
    Node head;
    private int size;

    LinkedList() {
        size = 0;
    }
    public class Node {
        String data;
        Node next;
        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }
    public void addFirst(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void addLast(String data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            return;
        }
        Node lastNode = head;
        while(lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }

    public void printList() {
        Node currNode = head;
        while(currNode != null) {
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public void removeFirst() {
        if(head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }
        head = this.head.next;
        size--;
    }
    public void removeLast() {
        if(head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }
        size--;
        if(head.next == null) {
            head = null;
            return;
        }
            Node currNode = head;
            Node lastNode = head.next;
            while(lastNode.next != null) {
                currNode = currNode.next;
                lastNode = lastNode.next;
            }
            currNode.next = null;
        }

        public int getSize() {
            return size;
        }

// Insert in the middle of a linked list (at a specified index 'i')  using Scratch

public void addInMiddle(int index, String data) {
    if(index > size || index < 0) {
        System.out.println("Invalid index value");
        return;
    }
    size++;

    Node newNode = new Node(data);
    if(head == null || index == 0) {
        newNode.next = head;
        head = newNode;
        return;
    }
    Node currNode = head;
    for(int i=1; i<size; i++) {
        if(i == index) {
            Node nextNode = currNode.next;
            currNode.next = newNode;
            newNode.next = nextNode;
            break;
        }
        currNode = currNode.next;
    }
}

// TO REVERSE A LINKED LIST (ITERATIVE + RECURSIVE)
             // ITERATIVE METHOD

             public void reverseIterate() {
                if(head==null||head.next==null) {
                    return;
                }
                Node prevNode = head;
                Node currNode = head.next;
                while(currNode!=null) {
                    Node nextNode = currNode.next;
                    currNode.next = prevNode;
                    prevNode = currNode;
                    currNode = nextNode;
                }
                head.next = null;
                head = prevNode;
            }
            
            // RECURSIVE METHOD
public Node reverseListRecursive(Node head) {
    // empty node or last node or only one node
    if(head==null||head.next==null) {
        return head;
    }
    Node newHead = reverseListRecursive(head.next);
    head.next.next = head;
    head.next = null;
    return newHead;
}

public static void main(String args[]) {
    LinkedList list = new LinkedList();
    list.addLast("is");
    list.addFirst("a");
    list.addLast("list");
    list.printList();
    list.addFirst("this");
    list.printList();
    System.out.println(list.getSize());
    list.removeFirst();
    list.printList();
    list.removeLast();
    list.printList();
    list.reverseIterate();
    list.printList();
    list.head = list.reverseListRecursive(list.head);
    list.printList();
 }
}

// COLLECTIONS  FRAMEWORK in Linked List

/*class LinkedList {
    public static void main(String args[]) {
        LinkedList<Integer> List = new LinkedList<Integer>();
        List.addFirst("a");
        List.addFirst("is");
        System.out.println(List);
        List.addFirst("this");
        List.addLast("list");
        System.out.println(List);
        System.out.println(List.size());
        for(int i=0; i<List.size(); i++) {
            System.out.println(List.get(i)+"->");
        }
        System.out.println(null);
        // For deleting node in Linked List using collection framework
        List.removeFirst();
        System.out.println(List);
        lList.removeLast();                            // OR  list.remove(3);
        System.out.println(List);                     //System.out.println(list);
    }
}*/