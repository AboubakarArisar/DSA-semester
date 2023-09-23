import java.util.*;

public class Task2Time {
    public static void main(String[] args) {
        Task2 obj = new Task2();
        Task2b obj1 = new Task2b();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for Factorial --> ");
        int num = sc.nextInt();
        System.out.println();
        long startTime = System.nanoTime();
        System.out.print("Factorial is --> ");
        obj.factorial(num);
        System.out.println();
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Time taken by iterative approach is --> " + duration + " nanoseconds");
        startTime = System.nanoTime();
        System.out.println("Factorial is --> " + obj1.recursiveFactorial(num));
        endTime = System.nanoTime();
        long duration2 = endTime - startTime;
        System.out.println("Time taken by recursive approach is --> " + duration2 + " nanoseconds");
        if(duration2 < duration) {
            System.out.println("Recursive approach is best");
        }
        else {
            System.out.println("Iterative appraoch is best");
        }


    }
}

class Task2 {
    public static void factorial(int num) {
        int mul = 1;
        for (int i = 1; i <= num; i++) {
            mul *= i;
        }
        System.out.println("Factorial of " + num + " is --> " + mul);
    }
}

class Task2b {
    static int mul = 1;

    public static int recursiveFactorial(int num) {
        if (num < 1) {
            return mul;
        }
        mul = num * recursiveFactorial(num - 1);
        return mul;
    }
}
