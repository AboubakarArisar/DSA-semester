class Cycle {
    public static void main(String[] args) {
        LList list = new LList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
       Node curr = list.head;
        while(curr.next!=null) {
            curr = curr.next;
        }
        curr.next = list.head.next;
        if (list.checkCycle()) {
            System.out.println("Cycle detected");
        } else {
            System.out.println("No cycle detected");
        }
    }
}

class LList {
    Node head;

    LList() {
        head = null;
    }

    void addNode(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = node;
        }
    }

    boolean checkCycle() {
        if (head == null || head.next == null) {
            return false;
        }

        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            if (slow == fast) {
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        return false;
    }
}

class Node {
    Node next;
    int data;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
