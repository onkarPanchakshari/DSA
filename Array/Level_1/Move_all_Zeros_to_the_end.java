package Array.Level_1;

import java.util.Arrays;

public class Move_all_Zeros_to_the_end {
    
     /*
      * Problem Statement: You are given an array of integers, 
                your task is to move all the zeros in the array to the end of the array and 
                move non-negative integers to the front by maintaining their order.
      */

      public static void Move(int[] arr){
        int j = -1;

        for(int i = 0; i < arr.length ;i++){
            if(arr[i] == 0){
                j = i;
                break;
            }
        }

        for(int i =j+1; i < arr.length;i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]=temp;
                j++;
            }
        }
      }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        System.out.println(Arrays.toString(arr));
        Move(arr);
        System.out.println(Arrays.toString(arr));
        
    }
}

/**
 *
 *  Optimal Approach(Using 2 pointers): 
   We can optimize the approach using 2 pointers i.e. i and j. 
   The pointer j will point to the first 0 in the array and i will point to the next index.

  Assume, the given array is {1, 0, 2, 3, 2, 0, 0, 4, 5, 1}. 
  Now, initially, we will place the 2-pointers like the following:

   The algorithm will be the following.

Algorithm:
First, using a loop, we will place the pointer j. If we don’t find any 0, we will not perform the following steps.
After that, we will point i to index j+1 and start moving the pointer using a loop.
While moving the pointer i, we will do the following:
If a[i] != 0 i.e. a[i] is a non-zero element: We will swap a[i] and a[j]. Now, the current j is pointing to the non-zero element a[i].
So, we will shift the pointer j by 1 so that it can again point to the first zero.
Finally, our array will be set in the right manner.



 */
