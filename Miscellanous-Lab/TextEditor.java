
import java.util.*;
public class TextEditor {
    Stack<String> history = new Stack<String>();
    public void push(String action){
        history.push(action);
    }
    public void pop(){
        history.pop();
        System.out.println("Last action deleted.");
    }
    public void display(){
        System.out.println("-----------History-------------");
        for (int i = 0; i < history.size(); i++) {
            System.out.println(history.get(i));
        }
    }
    public void clear(){
        history.clear();
        System.out.println("History cleared.");
    }

    public static void main(String[] args) {
    TextEditor te = new TextEditor();
    te.push("Typing");
    te.push("Deleting");
    te.push("Undoing");
    te.display();
    te.pop();
    te.display();
    te.clear();
    te.display();

    }
}
