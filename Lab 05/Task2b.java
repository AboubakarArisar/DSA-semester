
import java.util.Scanner;

public class Task3b {
    static int mul = 1;
    public static int recursiveFactorial(int num) {
        if(num<1) {
            return mul;
        }
        mul = num*recursiveFactorial(num - 1);
        return mul;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for factorial --> ");
        int number = sc.nextInt();
        System.out.println("Factorial of "+number+" is --> " + recursiveFactorial(number));
    }
}
