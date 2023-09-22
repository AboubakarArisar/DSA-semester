 package lab;

import java.util.Scanner;

public class Task2b {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the range -->  ");
        int N = scanner.nextInt();
        long startTime = System.currentTimeMillis();
        System.out.println("Fibonacci series up to range ");
        for (int i = 0; i < N; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken in recursive approach: " + (endTime - startTime) + " ms");
    }

}
