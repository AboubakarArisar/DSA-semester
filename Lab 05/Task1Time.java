import java.util.*;

public class Task1Time {
    public static void main(String[] args) {
        Task1 obj = new Task1();
        Task1b obj1 = new Task1b();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range till you want fibonacci series --> ");
        int range = sc.nextInt();

        System.out.println("======Fabonacci Series======");
        System.out.println();
        long startTime = System.nanoTime();
        obj.printSeries(range);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println();
        System.out.println("Time taken by Iterative Approach is : " + duration + " nanoseconds");
        System.out.println();
        System.out.println("======Fabonacci Series======");

        long startTime1 = System.nanoTime();

        for (int i = 0; i < range; i++) {
            System.out.print(obj1.fibonacci(i) + " ");
        }
        long endTime1 = System.nanoTime();
        long duration1 = (endTime1 - startTime1);
        System.out.println();
        System.out.println("Time taken by Recursive Approach is : " + duration1 + " nanoseconds");
        System.out.println();
        if (duration1 < duration) {
            System.out.println("Recursive Approach is best");
        } else {
            System.out.println("Iterative Approach is best");
        }
    }
}

class Task1 {
    public static void printSeries(int range) {
        int first = 0, second = 1;
        System.out.print(first + " " + second + " ");

        for (int i = 2; i < range; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }

}

class Task1b {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

}

