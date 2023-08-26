/**
 * Name : Aboubakar
 * CMS ID : 023-22-0107
 * Course : DSA
 * Date : 25/8/2023
 * 
 * In this program, we are finding the consecutive values coming in the two dimensional array
 */


import java.util.Scanner;

public class Nvalues{
    public static boolean NConRep(int arr[][], int rows, int columns, int N) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= columns - N; j++) {
                boolean isConsecutive = true;
                int targetValue = arr[i][j];
                
                for (int k = j + 1; k < j + N; k++) {
                    if (arr[i][k] != targetValue) {
                        isConsecutive = false;
                        break;
                    }
                }
                
                if (isConsecutive) {
                    return true;
                }
            }
        }
        
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number of columns and rows you want in the array");

        Scanner sc = new Scanner(System.in);
        int rows, columns, N;

        System.out.print("Enter the number of rows: ");
        rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        columns = sc.nextInt();

        int[][] arr = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Row: " + (i + 1) + ", Column: " + (j + 1) + " Value: ");
                arr[i][j] = sc.nextInt();
            }
        }
        
        System.out.print("Enter the value of N: ");
        N = sc.nextInt();

        boolean result = NConRep(arr, rows, columns, N);
        
        if (result) {
            System.out.println("There are " + N + " consecutive values that are the same.");
        } else {
            System.out.println("There are no " + N + " consecutive values that are the same.");
        }
    }
}
