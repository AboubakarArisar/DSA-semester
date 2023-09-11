public class Task2 {
    

    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();

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
    Object data;
    Node next;
//creating node
    Node(Object data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedListStack {
    private Node top;

    public LinkedListStack() {
        this.top = null;
    }
//pushing data in stack
    public void push(Object data) {
        //System.out.println("Inserting : " + data);
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }
//removing data from stack
    public Object pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }

        //System.out.println("Removing : " + top.data);

        Object data = top.data;
        top = top.next;
        return data;
    }
//getting data from stack
    public Object peek() {
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
