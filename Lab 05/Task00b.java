class Task00b {
    public static void printForward(char arr[], int index) {
        if(index+1>arr.length) {
            return;
        }
        System.out.print(arr[index]);
        printForward(arr,index+1);
    }
    public static void printReverse(char arr[], int index) {
        if(index+1>arr.length) {
            return;
        }
        printReverse(arr,index+1);
        System.out.print(arr[index]);
        
    }
    public static void main(String arg[]) {
        char arr[] = {'A','b','o','u','b','a','k','a','r'};
        System.out.println("1d character array in Forward Direction");
        printForward(arr,0);
        System.out.println();
        System.out.println("1d character array in Reverse Direction");
        printReverse(arr,0);
    }
}
