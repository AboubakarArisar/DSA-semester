import java.util.NoSuchElementException;
public class Task3Time {
       public static void main(String[] args) {
        linkedlist list = new linkedlist();
        list.addData(0);
        list.addData(1);
        list.addData(2);
        list.addData(3);
        list.addData(4);
        list.addData(5);
        System.out.println("Iterative Appraoch");
        long startTime = System.nanoTime();
        list.print();
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println();

        System.out.println("Recursive Approach");
        startTime = System.nanoTime();
        list.printRecursive(list.head);
        endTime = System.nanoTime();
        long duration1 = (endTime - startTime);

        System.out.println("Time Taken by Iterative approach --> "+duration+" nanoseconds");
        System.out.println("Time Taken by Recursive approach --> "+duration1+" nanoseconds");

        if(duration1<duration) {
            System.out.println("Recursive approach is best");
        }
        else {
            System.out.println("Iterative approach is best");
        }
    }
}


 class linkedlist {
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    linkedlist() {
        head = null;
    }
    void addData(int data) {
        Node node = new Node(data);
        if(head == null) {
            head = node;
        }
        else {
            Node curr = head;
            while(curr.next != null) {
                curr = curr.next;
            }
            curr.next = node;
        }
    }
    void print() {
        Node curr = head;
        while(curr!=null) {
            System.out.print(curr.data+" --> ");
            curr = curr.next;
        }
        System.out.print("null");
    }
      void printRecursive(Node curr) {
        if(curr==null) {
            return;
        }
        System.out.print(curr.data +" --> ");
        printRecursive(curr.next);
    }

 
}


   
