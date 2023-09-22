
import java.util.*;
class Task1 {

    public static void printAscending(int n) { 
        if(n > 0) {
        printAscending(n - 1);
        System.out.print(n + " ");
        }
    }

    
    public static void printDescending(int n) { 
        if(n > 0) {
        System.out.print(n + " ");
        printDescending(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number range that you want to display numbers --> ");
        int range = sc.nextInt();
        System.out.println("Numbers in Ascending order");
        printAscending(range);

        System.out.println();

        System.out.println("Numbers in Descending order");
        printDescending(range);
    }
}
