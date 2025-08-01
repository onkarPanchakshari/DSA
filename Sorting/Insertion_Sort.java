package Sorting;

import java.util.Arrays;

public class Insertion_Sort {

    /*
     Insertion sort is a simple sorting algorithm that works by iteratively inserting each element of an unsorted list into its correct position in a sorted portion of the list.
    It is like sorting playing cards in your hands.
    You split the cards into two groups: the sorted cards and the unsorted cards. 
    Then, you pick a card from the unsorted group and put it in the right place in the sorted group.
     */
    
    public static void InsertionSort(int arr[]){

        for(int i = 0 ; i <= arr.length-1;i++){
            int j = i;
            while(j > 0 && arr[j-1] > arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;

                j--;
            }
        }


    }
    public static void main(String[] args) {
         int[] arr = { 13 , 15 , 18 , 25, 9};
        System.out.println("Before Sorting the Array:-"+Arrays.toString(arr));
        InsertionSort(arr);
        System.out.println("After Sorting the Array:-" + Arrays.toString(arr));
    }
}

/*
 * 
 * Approach: 
  1:- Select an element in each iteration from the unsorted array(using a loop).
  2:-Place it in its corresponding position in the sorted part and shift the remaining elements accordingly (using an inner loop and swapping).
  3:-The “inner while loop” basically shifts the elements using swapping. 

  Note:- For more nuderstanding Go to(https://takeuforward.org/data-structure/insertion-sort-algorithm/)

   Time Complexity :-
 *    Worst-case and Average-case: O(n^2)
 *    Best-case: O(n)
 * 
 */
