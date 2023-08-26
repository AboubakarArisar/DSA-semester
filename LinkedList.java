import java.util.*;
import java.io.*;

public class LinkedList implements List {

    private class Node {
        private Object data;
        private Node next;

        public Node(Object data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    int size;

    LinkedList() {
        this.size = 0;
        this.head = new Node(null);
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void add(Object item) {
        Node newNode = new Node(item);
        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
        size++;
    }

    public void add(int index, Object item) {
        if (index < 1 || index > size + 1) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        Node newNode = new Node(item);
        Node current = head;
        int currentIndex = 0;

        while (currentIndex < index - 1) {
            current = current.next;
            currentIndex++;
        }

        newNode.next = current.next;
        current.next = newNode;
        size++;
    }

    public void remove(int index) {
        if (index < 1 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        Node current = head;
        int currentIndex = 0;

        while (currentIndex < index - 1) {
            current = current.next;
            currentIndex++;
        }

        Node nextNode = current.next;
        current.next = nextNode.next;
        nextNode.next = null;
        size--;
    }

    @Override
    public void remove(Object item) {
        Node current = head;

        while (current.next != null) {
            if (current.next.data.equals(item)) {
                Node removedNode = current.next;
                current.next = removedNode.next;
                removedNode.next = null;
                size--;
                return;
            }
            current = current.next;
        }
    }

    public List duplicate() {
        LinkedList duplicateList = new LinkedList();

        Node current = head.next;
        while (current != null) {
            duplicateList.add(current.data);
            current = current.next;
        }

        return duplicateList;
    }

    public List duplicateReversed() {
        LinkedList duplicateReversedList = new LinkedList();
    
        Node current = head.next;
        while (current != null) {
            duplicateReversedList.add(1, current.data);  
            current = current.next;
        }
    
        return duplicateReversedList;
    }
    

    public String toString() {
        String result = "[ size: " + size + " -";

        Node current = head.next;
        while (current != null) {
            result += " " + current.data;
            current = current.next;
        }

        result += " ]";
        return result;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("Aboubakar");
        list.add("Arisar");
        list.add("Sahab");
        System.out.println(list.toString()); 

        list.remove("Sahab");
        System.out.println(list.toString()); 

        List duplicateList = list.duplicate();
        System.out.println(duplicateList.toString()); 
        List duplicateReversedList = list.duplicateReversed();
        System.out.println(duplicateReversedList.toString()); 

    }

}

interface List {

    public boolean isEmpty();

    public int size();

    public void add(Object item);

    public void remove(int index);

    public void remove(Object item);

    public List duplicate();

    public List duplicateReversed();

}