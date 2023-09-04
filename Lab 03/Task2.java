public class Task2 {
    public static void main(String[] args) {

        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        System.out.println("Front element is : " + ((q.front != null) ? q.front.data : -1));
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();

        if (q.isEmpty()) {
            System.out.print("Queue is empty");
        } else {
            System.out.print("Queue is not empty");
        }
    }
}

class Queue {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    Node rear = null, front = null;

    // Utility function to add an item in the queue
    public void enqueue(int item) // insertion at the end
    {
        Node newNode = new Node(item);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;

    }

    // Utility function to remove front element from the queue and check for Queue
    // Underflow

    public int dequeue() // delete at the beginning
    {

        if (front == null) {
            System.out.println("Queue is Empty");
        }
        int value = front.data;
        Node temp = front;
        front = front.next;

        if (front == null)
            rear = null;

        return value;
    }

    // Utility function to return top element in a queue
    public int peek() {
        return front.data;
    }

    // Utility function to check if the queue is empty or not
    public boolean isEmpty() {

        return front == null;
    }
}
