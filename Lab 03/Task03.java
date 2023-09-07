public class Task02 {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element is : " + stack.peek());
        stack.pop();
        stack.pop();
        stack.pop();

        if (stack.isEmpty()) {
            System.out.print("Stack is empty");
        } else {
            System.out.print("Stack is not empty");
        }
    }
}

class Node {
    int data;
    Node next;
//creating node
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    private Node top;

    public Stack() {
        this.top = null;
    }
//pushing data in stack
    public void push(int data) {
        System.out.println("Inserting : " + data);
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }
//removing data from stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }

        System.out.println("Removing : " + top.data);

        int data = top.data;
        top = top.next;
        return data;
    }
//getting data from stack
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        return top.data;
    }
//check if stack is empty
    public boolean isEmpty() {
        return top == null;
    }
//returns size of stack
    public int size() {
        int size = 0;
        Node current = top;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }
}
