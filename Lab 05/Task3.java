import java.util.NoSuchElementException;

public class linkedlist {
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

    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        list.addData(0);
        list.addData(1);
        list.addData(2);
        list.addData(3);
        list.addData(4);
        list.addData(5);

        list.print();
    }
}
