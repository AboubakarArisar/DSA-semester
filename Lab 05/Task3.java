
import java.util.*;
public class Task3 {
    public static void factorial(int num) {
        int mul = 1;
        for(int i = 1 ; i <= num ; i++) {
            mul *= i;
        }
        System.out.println("Factorial of "+num+" is --> "+mul);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for factorial --> ");
        int number = sc.nextInt();
        factorial(number);
    }
}
