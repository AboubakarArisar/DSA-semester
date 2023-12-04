import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class jobManagment {
    class Printer{
        String documentInfo;
        public Printer(String documentInfo){
            this.documentInfo = documentInfo;
        }
    }
    Queue<Printer> printerQueue = new ArrayDeque<Printer>();
    public void addDocument(String documentInfo){
        Printer newDocument = new Printer(documentInfo);
        printerQueue.add(newDocument);
        System.out.println("Document added to queue.");
    }
    public void printDocument(){
        if(printerQueue.isEmpty()){
            System.out.println("No document in queue.");
            return;
        }
        Printer document = printerQueue.remove();
        System.out.println("Printing document: " + document.documentInfo);
    }
    public void displayQueue(){
        System.out.println("-----------Queue-------------");
        for (Printer printer : printerQueue) {
            System.out.println(printer.documentInfo);
        }
    }

    public void clearQueue(){
        printerQueue.clear();
        System.out.println("Queue cleared.");
    }
    public static void main(String[] args) {
    jobManagment job = new jobManagment();
    job.addDocument("Marksheet");
    job.addDocument("Resume");
    job.addDocument("Cover Letter");
    job.displayQueue();
    job.printDocument();
    job.displayQueue();
    }
}
