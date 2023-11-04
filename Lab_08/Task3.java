 class CompleteBinaryTree {
    private int[] heapArray;
    private int size;
    private int capacity;

    public CompleteBinaryTree(int capacity) {
        this.capacity = capacity;
        this.heapArray = new int[capacity];
        this.size = 0;
    }

    public void insert(int value) {
        if (size == capacity) {
            System.out.println("The binary tree is full.");
            return;
        }

        heapArray[size] = value;
        int currentIndex = size;
        size++;

        while (currentIndex > 0) {
            int parentIndex = (currentIndex - 1) / 2;
            if (heapArray[currentIndex] > heapArray[parentIndex]) {
                swap(currentIndex, parentIndex);
                currentIndex = parentIndex;
            } else {
                break;
            }
        }
    }

    public int remove() {
        if (size == 0) {
            System.out.println("The binary tree is empty.");
            return -1;
        }

        int removedValue = heapArray[0];
        heapArray[0] = heapArray[size - 1];
        size--;

        int currentIndex = 0;
        while (true) {
            int leftChild = 2 * currentIndex + 1;
            int rightChild = 2 * currentIndex + 2;
            int maxIndex = currentIndex;

            if (leftChild < size && heapArray[leftChild] > heapArray[maxIndex]) {
                maxIndex = leftChild;
            }
            if (rightChild < size && heapArray[rightChild] > heapArray[maxIndex]) {
                maxIndex = rightChild;
            }

            if (maxIndex != currentIndex) {
                swap(currentIndex, maxIndex);
                currentIndex = maxIndex;
            } else {
                break;
            }
        }

        return removedValue;
    }

    public void changeValue(int index, int newValue) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index.");
            return;
        }

        int oldValue = heapArray[index];
        heapArray[index] = newValue;

        if (newValue > oldValue) {
            while (index > 0) {
                int parentIndex = (index - 1) / 2;
                if (heapArray[index] > heapArray[parentIndex]) {
                    swap(index, parentIndex);
                    index = parentIndex;
                } else {
                    break;
                }
            }
        } else {
            int leftChild, rightChild, maxIndex;
            while (true) {
                leftChild = 2 * index + 1;
                rightChild = 2 * index + 2;
                maxIndex = index;

                if (leftChild < size && heapArray[leftChild] > heapArray[maxIndex]) {
                    maxIndex = leftChild;
                }
                if (rightChild < size && heapArray[rightChild] > heapArray[maxIndex]) {
                    maxIndex = rightChild;
                }

                if (maxIndex != index) {
                    swap(index, maxIndex);
                    index = maxIndex;
                } else {
                    break;
                }
            }
        }
    }

    public int search(int value) {
        for (int i = 0; i < size; i++) {
            if (heapArray[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(heapArray[i] + " ");
        }
        System.out.println();
    }

    private void swap(int index1, int index2) {
        int temp = heapArray[index1];
        heapArray[index1] = heapArray[index2];
        heapArray[index2] = temp;
    }
}
public class Task3{
    public static void main(String[] args) {
        CompleteBinaryTree cbt = new CompleteBinaryTree(10);

        cbt.insert(3);
        cbt.insert(8);
        cbt.insert(1);
        cbt.insert(5);
        cbt.insert(12);

        System.out.print("Initial heap: ");
        cbt.display();

        cbt.remove();
        System.out.print("Heap after removing max: ");
        cbt.display();

        cbt.changeValue(2, 10);
        System.out.print("Heap after changing value: ");
        cbt.display();

        int searchIndex = cbt.search(8);
        System.out.println("Search result for 8: " + (searchIndex != -1 ? "Found at index " + searchIndex : "Not found"));

    }
}
