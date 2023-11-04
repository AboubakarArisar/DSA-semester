class PriorityQueue {
    private int[] queue;
    private int front;
    private int rear;

    public PriorityQueue(int capacity) {
        queue = new int[capacity];
        front = 0;
        rear = 0;
    }

    public void insert(int value) {
        if (rear == queue.length) {
            System.out.println("Queue is full. Cannot insert more elements.");
            return;
        }

        int indexToInsert = rear;

        while (indexToInsert > front && value < queue[indexToInsert - 1]) {
            queue[indexToInsert] = queue[indexToInsert - 1];
            indexToInsert--;
        }

        queue[indexToInsert] = value;
        rear++;
    }

    public int extractMax() {
        if (front == rear) {
            System.out.println("Queue is empty. Cannot extract max.");
            return -1; // or handle it as needed
        }

        int max = queue[rear - 1];
        rear--;
        return max;
    }

    public int getMax() {
        if (front == rear) {
            System.out.println("Queue is empty. No max element.");
            return -1; // or handle it as needed
        }

        return queue[rear - 1];
    }
}

public class Task2 {
    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue(10);

        priorityQueue.insert(3);
        priorityQueue.insert(1);
        priorityQueue.insert(10);
        priorityQueue.insert(11);
        priorityQueue.insert(12);
        priorityQueue.insert(22);
        priorityQueue.insert(0);

        System.out.println("Max element: " + priorityQueue.getMax());

        int max = priorityQueue.extractMax();
        System.out.println("Extracted max element: " + max);
        System.out.println("Max element after extraction: " + priorityQueue.getMax());
    }
}
