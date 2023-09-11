
class LinkedList {
  class Node {
    Node next;
    int data;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  Node head = null;

  void add(int item) {
    Node node = new Node(item);
    if (head == null) {
      head = node;
    } else {
      Node curr = head;
      node.next = curr;
      head = node;
    }
  }

  void swap(int M, int N) {
    if (M == N) {
      return; // No need to swap if M and N are the same
    }

    // Find the nodes to be swapped
    Node prevM = null, currM = head;
    while (currM != null && currM.data != M) {
      prevM = currM;
      currM = currM.next;
    }

    Node prevN = null, currN = head;
    while (currN != null && currN.data != N) {
      prevN = currN;
      currN = currN.next;
    }

    // Update next pointers to swap nodes
    if (prevM != null) {
      prevM.next = currN;
    } else {
      head = currN;
    }

    if (prevN != null) {
      prevN.next = currM;
    } else {
      head = currM;
    }

    Node temp = currM.next;
    currM.next = currN.next;
    currN.next = temp;
  }

  void print() {
    Node curr = head;
    while (curr != null) {
      System.out.print(curr.data + " ");
      curr = curr.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    LinkedList ll = new LinkedList();
    ll.add(1);
    ll.add(4);
    ll.add(3);
    ll.add(2);
    ll.add(5);
    System.out.println("Before swapping");
    ll.print();
    ll.swap(2, 4); //passing data of nodes that we want to sort
    System.out.println("After Swapping");
    ll.print();
  }
}
