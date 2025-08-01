package Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class bubble_Sort {

    /*
    Bubble Sort is a simple sorting algorithm that repeatedly steps through a list, 
    compares adjacent elements, and swaps them if they are in the wrong order. 
    The process is repeated until no swaps are needed in a complete pass,
    indicating that the list is sorted 
     */

    public static void bubbleSort(int arr[]){
        int n = arr.length;
        
        for(int i = n-1; i >= 0 ; i-- ){ 
            int count = 0;
            for(int j = 0 ; j <= i-1 ; j++){
                if(arr[j] > arr[j+1]){        //this condition is swap the numbers 
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    count = 1 ;
                }
                
            }
            if(count == 0){
                    break;
                }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 13 , 15 , 18 , 25, 9};
        System.out.println("Before Sorting the Array:-"+Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("After Sorting the Array:-" + Arrays.toString(arr));
    }
    
}

/*  Explantion:-

    Bubble Sort is an elementary sorting algorithm, which works by repeatedly exchanging adjacent elements,if necessary.
    When no exchanges are required, the file is sorted.

    We assume list is an array of n elements. We further assume that swap function swaps the values of the given array elements.

    Step 1 − Check if the first element in the input array is greater than the next element in the array.

    Step 2 − If it is greater, swap the two elements; otherwise move the pointer forward in the array.

    Step 3 − Repeat Step 2 until we reach the end of the array.

    Step 4 − Check if the elements are sorted; if not, repeat the same process (Step 1 to Step 3) from the last element of the array to the first.

    Step 5 − The final output achieved is the sorted array. 


 *The algorithm steps are as follows:

Step 1:- First, we will select the range of the unsorted array. For that, we will run a loop(say i) that will signify the last index of the selected range. 
        The loop will run backward from index n-1 to 0(where n = size of the array). 
         The value i = n-1 means the range is from 0 to n-1, and similarly, i = n-2 means the range is from 0 to n-2, and so on.

Step 2:- Within the loop, we will run another loop(say j, runs from 0 to i-1 though the range is from 0 to i) to push the maximum element to the last index of the selected range,
         by repeatedly swapping adjacent elements.Basically, we will swap adjacent elements(if arr[j] > arr[j+1]) until the maximum element of the range reaches the end.

Step 3:- Thus, after each iteration, the last part of the array will become sorted. Like: after the first iteration, the array up to the last index will be sorted, 
         and after the second iteration, the array up to the second last index will be sorted, and so on.
         After (n-1) iteration, the whole array will be sorted.

Note: Here, after each iteration, the array becomes sorted up to the last index of the range.
      That is why the last index of the range decreases by 1 after each iteration. 
      This decrement is achieved by the outer loop and the last index is represented by variable i in the following code. 
      And the inner loop(i.e. j) helps to push the maximum element of range [0….i] to the last index(i.e. index i).
 * 
 */
