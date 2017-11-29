/**
* Class to sort an array of elements using bubble sort
* 
* 
* @author Meghan Cowan
*/

public class MyBubbleSort {
  
    // logic to sort the elements
    public static void bubbleSort(int array[]) {
        int length = array.length;
        int k;
        for (int m = length; m >= 0; m--) {
            for (int i = 0; i < length - 1; i++) {
                k = i + 1;
                if (array[i] > array[k]) {
                    swapNumbers(i, k, array);
                }
            }
            printNumbers(array);
        }
    }
 /**
* Method to swap positions in an array 
*
*
*/
    private static void swapNumbers(int i, int j, int[] array) {
  
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
  /**
* method called to print the numbers
*
*/
    private static void printNumbers(int[] input) {
          
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println("\n");
    }
  
    public static void main(String[] args) {
        int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
        bubbleSort(input);
  
    }
}