public class Task01 {
    public static void main(String[] args) {
        Stack stack = new Stack(3);

        stack.push(1); // Inserting 1 in the stack
        stack.push(2); // Inserting 2 in the stack

        stack.pop(); // removing the top 2
        stack.pop(); // removing the top 1

        stack.push(3); // Inserting 3 in the stack

        System.out.println("Top element is: " + stack.peek());
        System.out.println("Stack size is : " + stack.size());

        stack.pop(); // removing the top 3

        // check if stack is empty
        if (stack.isEmpty())
            System.out.println("Stack Is Empty");
        else
            System.out.println("Stack Is Not Empty");
    }
}

class Stack {
    private int arr[];
    private int top;
    private int capacity;

    // Constructor to initialize stack
    Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // Utility function to add an element x in the stack and check for stack
    // overflow
    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack is Full can not push anything");
            return;
        }
        System.out.println("Inserting "+x);
        top++;
        arr[top] = x;
    }

    // Utility function to pop top element from the stack and check for stack
    // underflow
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty can not pop anything");
            return -1;
        }

        int num = arr[top];
        System.out.println("removing "+num);
        top--;
        return num;
    }

    // Utility function to return top element in a stack
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty, there is no top element");
            return -1;
        }
        return arr[top];
    }

    // Utility function to return the size of the stack
    public int size() {
        return top + 1;
    }

    // Utility function to check if the stack is empty or not
    public boolean isEmpty() {
        return (top == -1);
    }

    // Utility function to check if the stack is full or not
    public boolean isFull() {
        return (top == (capacity - 1));
    }
}
