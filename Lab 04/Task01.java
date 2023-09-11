import java.util.Stack;

public class Task1 {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(3);

        stack.push(1); // Inserting 1 in the stack
        stack.push(2); // Inserting 2 in the stack

        stack.pop(); // removing the top 2
        stack.pop(); // removing the top 1

        stack.push(3); // Inserting 3 in the stack

        System.out.println("Top element is: " + stack.peek());

        stack.pop(); // removing the top 3

        // check if stack is empty
        if (stack.isEmpty())
            System.out.println("Stack Is Empty");
        else
            System.out.println("Stack Is Not Empty");
    }
}

// Create a class for implementing a stack using an array.
class ArrayStack {
    // Constructor to initialize the stack with a given size.
    int arr[];
    int top = 0;

    public ArrayStack(int size) {
        arr = new int[size];
    }

    // Push an element onto the stack.
    public void push(int value) {
        arr[top++] = value;
    }

    // Pop and return the top element from the stack.
    public int pop() {
        int val = arr[top];
        top--;
        return val;
    }

    // Check if the stack is empty.
    public boolean isEmpty() {

        return top == 0;
    }

    // Peek at the top element of the stack without removing it.
    public int peek() {
        // ...
        return arr[top];
    }
}
