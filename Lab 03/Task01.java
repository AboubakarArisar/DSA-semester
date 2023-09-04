import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println("Front element is : "+q.peek());
        q.dequeue();
        System.out.println("Front element is : "+q.peek());
        System.out.println("Queue size is : "+q.size());
        q.dequeue();
        q.dequeue();
        if(q.isEmpty()){
            System.out.println("Queue is Empty");
        }
        else{
            System.out.println("Queue is not Empty");
        }
        q.enqueue(0);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        if(q.isFull()){
            System.out.println("Queue is Full");
        }
        else{
            System.out.println("Queue is not full");
        }
        
    }
}

class Queue {
    private int arr[];
    private int front;
    private int rear;
    private int capacity;
    private int count;

    Queue(int size) {
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    // Utility function to add an item to the queue and check for queue overflow
    public void enqueue(int item) {
        System.out.println("Inserting "+item);
       
       rear = (rear + 1) % capacity;
       arr[rear] = item;
       count++;
    }
    // Utility function to remove front element from the queue and check for Queue
    // Underflow

    public int dequeue() {
        int value = 0;
        if (isEmpty()) {
        System.out.println("Queue is Empty");
    } else {
        value = arr[front];
        System.out.println("Removing "+value);
        front = (front + 1) % capacity;
        rear = (rear + 1) % capacity;
        count--;
    }
    return value;
    }

    // Utility function to return front element in the queue and check for Queue
    // Underflow
    public int peek() {
        return arr[front];
        
    }

    // Utility function to return the size of the queue
    public int size() {
        return count;
    }

    // Utility function to check if the queue is empty or not
    public boolean isEmpty() {
        return count == 0;
    }

    // Utility function to check if the queue is empty or not
    public boolean isFull() {
        return count == capacity;
    }


}
