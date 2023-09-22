import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter brackets: ");
        String brackets = sc.next();

        Stack stack = new Stack();

        for (int i = 0; i < brackets.length(); i++) {
            char ch = brackets.charAt(i);
            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            } else if (ch == '}' || ch == ']' || ch == ')') {
                // Check if the stack is empty before peeking
                if (!stack.isEmpty()) {
                    char chk = (char) stack.peek();
                    if (areMatching(chk, ch)) {
                        stack.pop();
                    } else {
                        System.out.println("Not Balanced Brackets");
                        return;  // Exit early if brackets are not balanced
                    }
                } else {
                    System.out.println("Not Balanced Brackets");
                    return;  // Exit early if brackets are not balanced
                }
            }
        }

        if (stack.isEmpty()) {
            System.out.println("Balanced Brackets");
        } else {
            System.out.println("Not Balanced Brackets");
        }
    }

    // Helper method to check if brackets are matching
    private static boolean areMatching(char openBracket, char closeBracket) {
        return (openBracket == '{' && closeBracket == '}') ||
               (openBracket == '[' && closeBracket == ']') ||
               (openBracket == '(' && closeBracket == ')');
    }
}

class Node {
    Object data;
    Node next;

    Node(Object data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    private Node top;

    public Stack() {
        this.top = null;
    }

    public void push(Object data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public Object pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null; // Return null if stack is empty
        }
        Object data = top.data;
        top = top.next;
        return data;
    }

    public Object peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null; // Return null if stack is empty
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }
}
