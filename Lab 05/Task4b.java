import java.util.Scanner;

public class searching {
   public static boolean recursiveSearching(int[] array, int value,int size) {
    
         if(size<0) {
            return false;
        }
        if(array[size] == value) {
           return true;           
        }
        return recursiveSearching(array,value,size-1);
        
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
        boolean result = recursiveSearching(array,value,size-1);
        if(result) {
            System.out.println("Value found");
        }
        else {
             System.out.println("Value not found");
        }
        
    }
}
