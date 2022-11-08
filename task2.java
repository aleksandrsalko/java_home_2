import java.util.Arrays;
import java.util.Scanner;

public class task2 {
    public static void insertionSort(int[] myArray) {
        int j;
        
        for (int i = 1; i < myArray.length; i++) {
            int swap = myArray[i];
            for (j = i; j > 0 && swap < myArray[j - 1]; j--) {
                myArray[j] = myArray[j - 1];
            }
            myArray[j] = swap;
        }
        System.out.println(Arrays.toString(myArray));
    }
    
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = scanner.nextInt();
        System.out.println("Enter the elements of the array : ");
        int[] myArray = new int[size];
        for(int i=0; i<size; i++) {
            myArray[i] = scanner.nextInt();
        }
        insertionSort(myArray);
    }
    
      
  }
