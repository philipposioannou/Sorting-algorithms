import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
* Class to sort an array of elements using selection sort
* 
* 
* @author Meghan Cowan
*/

public class SelectionSort {

    public static void main(String[] args) {
        int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
        System.out.println(Arrays.toString(input));
        selectionSort(input, 0);
        System.out.println(Arrays.toString(input));
  
        
    }
/**
*
* method to perform selection sort on an array of integers.
*
*/
	private static void selectionSort(int[] input, int start) {
		int length = input.length;
		if (start >= length - 1){
			return;
		}

		int min = start;                              //initialize var min to the beginning of the array
		for (int i = start + 1; i < length; i++) {    //loop array until each pos has been compared
			if (input[i] < input[min]) {          //test for position
				min = i;                      //reassign pos
			}
		}
		
		int temp = input[start];
		input[start] = input[min];
		input[min] = temp;
		selectionSort(input, start + 1);
		
		
		
	}

	
	
}
