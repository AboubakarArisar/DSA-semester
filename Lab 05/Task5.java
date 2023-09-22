import java.util.NoSuchElementException;

public class reverselist {
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    reverselist() {
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
            System.out.print("null");
            return;
        }
        System.out.print(curr.data +" --> ");
        printRecursive(curr.next);
    }

    public Node makeReverse(Node head) {
        Node prev = null;
        Node current = head;
        Node nextNode;
    
        while (current != null) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
    
        head = prev;
        return head;
    }

    public static void main(String[] args) {
       reverselist list = new reverselist();
        list.addData(0);
        list.addData(1);
        list.addData(2);
        list.addData(3);
        list.addData(4);
        list.addData(5);
        System.out.println("Orignial linkedlist");
        list.print();
        Node head = list.makeReverse(list.head);
        System.out.println();
        System.out.println("Reversed list:");
        list.print();

    }
}
