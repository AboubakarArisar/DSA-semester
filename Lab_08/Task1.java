class PriorityQueueUsingArray   
{   
    // create an array
    int array[];
    int size;
    int front = -1,rear = -1;
    // constructor
    public PriorityQueueUsingArray(int size) {
	// initialize an array
    array = new int[size];
    this.size = size;
    }
    public void insert(int data) {    	 
    	// insert data in array in any order
    	// handle all possible exceptions/errors
            if(rear == -1) {
                front = 0;
                rear = 0;
                
                System.out.println("inserting :"+data+" at index : "+rear);
                array[rear++] = data;
            }
            else if(rear ==size) {
                System.out.println("Sorry can't insert queue is full");
                rear--;
            }
            else {
                System.out.println("inserting :"+data+" at index : "+rear);
                array[rear++] = data;
            }
    	
    }
    int ind = 0 ;
    int val = 0;
    public int extractMax() {   	 
    	// return and remove max value from array
    	// handle all possible exceptions/errors
        if(front == -1) {
        System.out.println("queue is empty");
        return -1;}
        else {
            
            val = array[0];
            for(int i = 1 ; i < array.length; i++) {
                if(val < array[i]) {
                    val = array[i];
                    ind = i;
                }
                else continue;
            }
              for (int i = ind; i < rear; i++) {
                array[i] = array[i + 1];
            }
            
            rear--;
    
            if (front > rear) {
                front = rear = -1;
            }

        }
        return val;
    }
    
    public int getMax() {      	 
    	if(rear == -1) {
            System.out.println("Queue is empty nothing in it");
        }
        else {
        val = array[0];
        for(int i = 1 ; i < array.length; i++) {
            if(val < array[i]) {
                val = array[i];
                ind = i;
            }
            else continue;
        }
    }
    return val;
    }
    
    
    public boolean searchData(int data) {      	 
    	// search data from array
    	// handle all possible exceptions/errors
        boolean flag = false;
        if(rear == -1) {
            System.out.println("Queue is empty nothing int it");
        }
        else {
            for(int i = 0 ; i < array.length; i++) {
                if(array[i] == data) {
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }
    public void display() {
        if(rear == -1) {
            System.out.println("Queue is empty");
            return;
        }

        
        for(int i = front; i<=rear; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
public class Task1{
    public static void main(String[] args)   
    {   
        // Test the main method by creating object for PriorityQueueUsingArray class
    	PriorityQueueUsingArray pq = new PriorityQueueUsingArray(5);
    	// insert some values using insert method
    	pq.insert(1);
    	pq.insert(2);
    	pq.insert(3);
    	pq.insert(4);
    	pq.insert(5);
    	// pq.insert(5);
    	
    	// call extractMax method and print output
    	// System.out.println("Extract Max : "+pq.extractMax());
    	// System.out.println("Extract Max : "+pq.extractMax());
    	
    	
    	// insert some values using insert method
    	
    	// pq.insert(55);
    	// pq.insert(95);
    	
    	// call getMax method and print output
    	//System.out.println("Greatest element in the array is : "+pq.getMax());
    	
        //Full Queue Display
       // pq.display();
    	
    }   
}   
