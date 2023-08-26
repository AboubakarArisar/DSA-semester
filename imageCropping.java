/**
 * Name : Aboubakar
 * CMS ID : 023-22-0107
 * Course : DSA
 * Date : 25/8/2023
 * 
 * In this program, we are extracting boundaries in the first part and in second part cropping center in image cropping problem
 */



import java.util.Scanner;

public class imageCropping {
    public static void extractBoundaries(int arr[][], int rows, int columns) {
        System.out.println("Array after extracting boundaries");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i == 0 || j == 0 || i == rows - 1 || j == columns - 1) {
                    System.out.print(arr[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }


        public static void cropCenterPart(int arr[][], int rows, int columns) {
            System.out.println("Array after excluding Boundaries");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if ((i == 0 || j == 0 || i == rows - 1 || j == columns - 1)) {
                    System.out.print("");
                } else {
                    System.out.print(arr[i][j] + " ");
                }

            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        System.out.println("Enter the number of columns and rows you want in the array");
        

        Scanner sc = new Scanner(System.in);
        int rows = 0, columns = 0;

   

        
            System.out.print("Enter the number of rows: ");
            rows = sc.nextInt();
            System.out.print("Enter the number of columns: ");
            columns = sc.nextInt();
        int[][] arr = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Row: " + (i + 1) + " Column: " + (j + 1) + " Value: ");
                arr[i][j] = sc.nextInt();
                
            }
        }

        extractBoundaries(arr, rows, columns);
        cropCenterPart(arr, rows, columns);
    }
}
