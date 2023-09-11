
import java.util.EmptyStackException;
import java.util.Stack;

public class Task7 {
    public static void main(String[] args) {
        WebBrowserNavigator web = new WebBrowserNavigator();
        web.visitPage("Youtube");
        web.visitPage("Google");
        web.visitPage("Github");
        web.back();
        web.forward();
        web.forward();
    }
}

class WebBrowserNavigator {
    Stack<String> stack1 = new Stack<>();
    Stack<String> stack2 = new Stack<>();

    public WebBrowserNavigator() {
    }

    public void visitPage(String url) {
        stack1.push(url);
        System.out.println("Visiting " + url);
    }

    public void back() {
        try {
            String data = stack1.pop();
            System.out.println("Back to " + stack1.peek());
            stack2.push(data);
        } catch (EmptyStackException e) {
            System.out.println("No page to go back to.");
        }
    }

    public void forward() {
        try {
            String data = stack2.pop();
            System.out.println("Forward to " + data);
            stack1.push(data);
        } catch (EmptyStackException e) {
            System.out.println("No page to go forward to.");
        }
    }
}
