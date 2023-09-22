import java.util.Scanner;

public class searching {
    public static boolean searchingNumber(int[] array, int size, int value) {
        boolean flag = false;
        for(int i = 0 ; i < size; i++) {
            if(array[i] ==value) {
                flag =true;
                break;
            }
        }
return flag;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[10];
        int size = array.length;
        for(int i = 0 ; i < size; i++) {
            array[i] = i;
        }
        System.out.print("Which value you want to search --> ");
        int value = sc.nextInt();
        boolean result = searchingNumber(array,size,value);
        if(result) {
            System.out.println("Value found");
        }
        else {
             System.out.println("Value not found");
        }
        
    }
}
