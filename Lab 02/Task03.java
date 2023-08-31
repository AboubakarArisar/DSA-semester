/* 
*Name : Aboubakar
*CMS : 023-22-0107
*Course : DSA
*Lab : 02
*Date : 28/8/2023    
* Task 03
*/



public class Task03 {
    public static void main(String[] args) {
        Node head = new Node("Aboubakar");
        head.next = new Node("Arisar");
        head.next.next = new Node("Sahab"); 
        head.next.next.next = head.next;

        if(head.checkCycle(head)){
            System.out.println("Cycle is detected");
        }
        else{
            System.out.println("Cycle is not detected");
        }
    }
    
}

class Node{
    Node next;
    Object data; 
    Node(Object data) {
        this.data = data;
        this.next = null;
    } 
    public boolean checkCycle(Node head){
        if(head == null && head.next == null){
            return false;
        }
        Node curr = head;
        Node checker = head.next;
        while(checker != null && checker.next != null){
            if(curr == checker){
                return true;
            }
            curr = curr.next;
            checker = checker.next.next;
        }

        return false;
    }
}
