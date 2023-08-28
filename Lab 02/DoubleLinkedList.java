/* 
*Name : Aboubakar
*CMS : 023-22-0107
*Course : DSA
*Lab : 02
*Date : 28/8/2023    
*/

class DoubleLinkedList{
    Node head;
    DoubleLinkedList(){
        this.head = null;
    }
    class Node{
        String name;
        Node pre,next;
        Node(String name){
            this.name = name;
            this.pre = null;
            this.next = null;
        }
    }

    public void insertAtBeginning(String name) {
        Node newNode = new Node(name);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head.pre = newNode;
            head = newNode; 
        }
    }
    
    public void insertAtBeginning(Node node)
    {
          if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node; 
        }
    }
    public void insertAtEnd(String name)
    {
        Node newNode = new Node(name);
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
        newNode.pre = curr;
    }
    public void insertAtEnd(Node node) {
        if (head == null) {
            head = node;
            return;
        }
    
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = node;
    }
    
    public void insertAfterName(String name, Node node){
        if(head == null){
            System.out.print("List is empty");
        }
        if(head.equals(name)){
            head.next = node;
            node.pre = head;
        }
        else{
            Node curr = head;
            while(!(curr.name.equals(name))){
                curr = curr.next;
            }
            node.pre = curr;
            node.next = curr.next;
            curr.next = node;
        
        }
    }
    public void insertBeforeName(String name, Node node) {
        if(head==null){
            System.out.println("List is empty");
        }
        if(head.name.equals(name)){
            head.pre = node;
            node.next = head;
            head = node;

        }
        else{
            Node curr = head;
            while(!(curr.name.equals(name))){
                curr = curr.next;
            }
            node.next = curr;
            node.pre = curr.pre;
            curr.pre.next = node;
            curr.pre = node;
        }

    }
    public void makeCircular(){

    }
    public void printAll(){
        Node curr = head;
        while(curr!= null){
            System.out.print(curr.name+" --> ");
            curr = curr.next;
        }
        System.out.print(" null");
    }
    public static void main(String[] args) {
       DoubleLinkedList list = new DoubleLinkedList();
       DoubleLinkedList.Node node1 = list.new Node("Name : ");
       DoubleLinkedList.Node node2 = list.new Node("Thanks ");
       DoubleLinkedList.Node node3 = list.new Node("Before ");
       DoubleLinkedList.Node node4 = list.new Node("After ");
       list.insertAtBeginning("Arisar");
       list.insertAtBeginning("Aboubakar");
       list.insertAtEnd("Sahab");
       list.insertAtBeginning(node1);
       list.insertAtEnd(node2);
       list.insertBeforeName("Sahab", node3);
       list.insertAfterName("Aboubakar", node4);

       
       list.printAll();

    }
}
