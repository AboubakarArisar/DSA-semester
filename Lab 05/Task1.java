
import java.util.*;
public class Task1 {
    public static void printSeries(int range) {
         int sum = 0 , next = 1, curr;
         System.out.print(sum + " ");
         for(int i = 0 ; i <= range; i++){
            curr=next;
            next=sum;
            sum=curr+next;
            System.out.print(sum+" ");
         }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range till you want fibonacci series --> ");
        int range = sc.nextInt();
        long startTime = System.nanoTime();
        System.out.println("======Fabonacci Series======");
        printSeries(range);
        System.out.println();
        long endTime = System.nanoTime();
        System.out.println("Time taken in iterative approach is --> "+(startTime - endTime) + "ms");
    }
}
