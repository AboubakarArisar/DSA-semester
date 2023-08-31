/* 
*Name : Aboubakar
*CMS : 023-22-0107
*Course : DSA
*Lab : 02
*Date : 28/8/2023    
* Task 02
*/



public class Task02 {
    public static void main(String[] args) {
        
        /*
         * Single LinkedList implementation
        */
        
        
        SingleLinkedList list = new SingleLinkedList();
        list.addAtBeginning("Sahab");
        list.addAtBeginning("Arisar");
        list.addAtBeginning("Aboubakar");
        list.removeFromBeginning();
        list.addAtEnd("Saddau");
        list.addAtEnd("Last");
        SingleLinkedList.Node node = list.new Node("After");
        list.addAfterSpecific("Saddau", node);
        System.out.println(list.head.data);
        System.out.println(list.tail.data);
        list.removeFromEnding();
        System.out.println("Last : "+list.tail.data);

        /*
         *Double LinkedList implementation
        */
        
        
        
        DoubleyLinkedList List = new DoubleyLinkedList();
        List.insertAtBeginning("Sahab");
        List.insertAtBeginning("Arisar");
        List.insertAtBeginning("Aboubakar");
        //list.removeFromBeginning();
        List.insertAtEnding("Saddau");
        List.insertAtEnding("Last");
        DoubleyLinkedList.Node node = List.new Node("After");
        List.addAfter("Saddau", node);
        System.out.println("head :"+list.head.data);
        System.out.println("tail : "+list.tail.data);
        List.removeFromEnd();
        System.out.println("Last : "+list.tail.data);


      





    }
    
}

class SingleLinkedList {
    class Node{
        Node next;
        String data;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    Node head,tail;




    
    /* Method to add at the beginning of the list in single linked list  with Tail*/
    public void addAtBeginning(String name){
        Node tmp = new Node(name);
        if(head == null){
            tmp.next = head;
            head = tmp;
            tail = tmp;
        }
        else{
            tmp.next = head;
            head = tmp;
            Node curr = head;
            while(curr.next != null){
                curr = curr.next;
            }
            tail = curr;
        }
    }
 
    /* Method to add at the Ending of the list with Tail */
    public void addAtEnd(String name){
        Node tmp = new Node(name);
        tail.next = tmp;
        tail = tmp;
        
    }

    
    /* Method to add at the Specific data with Tail */
    public void addAfterSpecific(String name, Node node){
        Node curr = head;
        if(head.data.equals(name)){
            head.next = node;
            tail = node;
        }
        if(tail.data.equals(name)){
            tail.next = node;
            tail = node;
        }
        while(curr.data != name){
            curr = curr.next;
        }
        node.next = curr.next;
        curr.next = node;
        
        
    }


    /*Methods for removing data from Beginning */
    public void removeFromBeginning(){
        Node curr = head.next;
        head.next = null;
        head = curr;   
    }

    
    /*Methods for removing data from Ending */
    public void removeFromEnding(){
        Node curr = head;
        while(curr.next.next!=null){
            curr = curr.next;
        }
        tail = curr;
        tail.next = null;
    }


}
class DoubleyLinkedList{
    class Node{
        Node next, pre;
        String data;
        Node(String data){
            this.data = data;
            this.next = this.pre = null;
        }
    }
    Node head , tail;

    public void insertAtBeginning(String name){
        Node node = new Node(name);
            
        if(head == null){
            head = node;
            tail = node;
        }

        else{
            Node curr = head;
            curr.pre = node;
            node.next = curr;
            node.pre = null;
            head = node;
            while(curr.next != null){
                curr = curr.next;
            }
            tail = curr;
            tail.pre = curr.pre;
            tail.next = null;
        }
    }
    public void insertAtEnding(String name){
        Node node = new Node(name);
         if(head == null){
            head = node;
        }

        else{
            Node curr = head;
            curr.pre = node;
            node.next = curr;
            head = node;
            while(curr.next != null){
                curr = curr.next;
            }
            tail = curr;
            tail.pre = curr.pre;
            tail.next = null;
        }
    }

    public void addAfter(String name, Node node){
        if(head == null){
            System.out.println("List is empty");
        }
        if(head.data.equals(name)){
            System.out.println("Name found");
            Node curr = head;
            curr.next.pre = node;
            node.next = curr.next;
            node.pre = head;
            head.next = node;
        }
        else{
            Node curr = head;
            while(!(curr.data.equals(name))){
                curr = curr.next;
            }
            curr.next.pre = node;
            node.next = curr.next;
            node.pre = curr;
            curr.next = node;

        }
    }

    public void removeFromBeginning(){
        Node curr = head;
        head = curr.next;
        curr.next = null;
        head.pre = null;
    }
    public void removeFromEnd(){
        Node curr = tail;
        tail = tail.pre;
        tail.next = null;
    }
    public void removeSpecific(String name){
        Node curr = head;
        while(!(curr.next.data.equals(name))){
            curr = curr.next;
        }
        //curr.next = null;
        curr.next = curr.next.next;
        curr.next.pre = null;
        curr.next.next.pre = curr;
    }



}
