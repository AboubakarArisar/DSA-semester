import java.util.Scanner;
public class Task4Time {
    public static void main(String[] args) {
        searching s = new searching();
        Scanner sc = new Scanner(System.in);
        int array[] = new int[10];
        int size = array.length;
        for(int i = 0 ; i < size; i++) {
            array[i] = i;
        }
        System.out.print("Which value you want to search --> ");
        int value = sc.nextInt();
        long startTime = System.nanoTime();
        boolean result = s.searchingNumber(array,size,value);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        startTime = System.nanoTime();
        result = s.recursiveSearching(array, value, size-1);
        endTime = System.nanoTime();
        long duration1 = endTime - startTime;
        if(result) {
            System.out.println("Value found");
        }
        else {
             System.out.println("Value not found");
        }
        System.out.println("Time taken by iterative approach is --> "+duration+" nanoseconds");
        System.out.println("Time taken by recursive approach is --> "+duration1+" nanoseconds");
        if(duration1 < duration) {
            System.out.println("Recursive approach is best");
        }
        else {
            System.out.println("Iterative appraoch is best");
        }
        
    }
}


 class searching {
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
     public static boolean recursiveSearching(int[] array, int value,int size) {
    
         if(size<0) {
            return false;
        }
        if(array[size] == value) {
           return true;           
        }
        return recursiveSearching(array,value,size-1);
        
    }
    
}

