/**
 * Name : Aboubakar
 * CMS ID : 023-22-0107
 * Course : DSA
 * Date : 25/8/2023
 * 
 * In this program, we work on the manipulation of linkedlist and some methods like add data remove etc
 */



import java.util.*;

/**
 * Represents a singly linked list implementation.
 */
public class LinkedList implements List {

    // Node class
    private class Node {
        private Object data;
        private Node next;

        public Node(Object data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private int size;

    /**
     * Constructs an empty linked list.
     */
    LinkedList() {
        this.size = 0;
        this.head = new Node(null);
    }

    /**
     * Checks if the linked list is empty.
     *
     * @return true if the linked list is empty, false otherwise
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Returns the size of the linked list.
     *
     * @return the size of the linked list
     */
    public int size() {
        return size;
    }

    /**
     * Adds an item to the end of the linked list.
     *
     * @param item the item to be added
     */
    public void add(Object item) {
        Node newNode = new Node(item);
        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
        size++;
    }

    /**
     * Adds an item at the specified index in the linked list.
     *
     * @param index the index at which the item will be added
     * @param item the item to be added
     * @throws IndexOutOfBoundsException if the index is invalid
     */
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

    /**
     * Removes the element at the specified index from the linked list.
     *
     * @param index the index of the element to be removed
     * @throws IndexOutOfBoundsException if the index is invalid
     */
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

    /**
     * Removes the first occurrence of the specified item from the linked list.
     *
     * @param item the item to be removed
     */
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

    /**
     * Creates and returns a new linked list that is a duplicate of the original list.
     *
     * @return a new linked list that is a duplicate of the original list
     */
    public List duplicate() {
        LinkedList duplicateList = new LinkedList();

        Node current = head.next;
        while (current != null) {
            duplicateList.add(current.data);
            current = current.next;
        }

        return duplicateList;
    }

    /**
     * Creates and returns a new linkedlist that is a duplicate of the original list, but elements are in reverse order.
     *
     * @return a new linked list that is a duplicate/copy of the original one, but reversed
     */
    public List duplicateReversed() {
        LinkedList duplicateReversedList = new LinkedList();
    
        Node current = head.next;
        while (current != null) {
            duplicateReversedList.add(1, current.data);  
            current = current.next;
        }
    
        return duplicateReversedList;
    }
    

    /**
     * Returns the linked list in the form of string.
     */
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

    /**
     * Main method to run the LinkedList functionalities.
    
     */
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

/**
 *  List interface with methods that we have implemented in LinkedList class.
 */
interface List {

    /**
     * Checks if the linked list is empty.
     *
     * @return true if list is empty othewise it will return false
     */
    public boolean isEmpty();

    /**
     * Returns the size of the linked list.
     */
    public int size();

    /**
     * Adds an item to the linked list.
     
     */
    public void add(Object item);

    /**
     * Removes the element from the give index by user from the linked list.
     */
    public void remove(int index);

    /**
     * Removes the element from the list
     */
    public void remove(Object item);

    /**
     * Creates and returns a new linked list that is a duplicate of the original list.
     */
    public List duplicate();

    /**
     * Creates and returns a new linked list that is a duplicate of the original list in reverse order.
     */
    public List duplicateReversed();

}
