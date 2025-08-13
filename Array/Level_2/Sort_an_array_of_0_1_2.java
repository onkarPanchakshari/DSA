package Array.Level_2;

import java.util.Arrays;

/*
 *This problem is a variation of the popular Dutch National flag algorithm. 
  This algorithm contains 3 pointers i.e. low, mid, and high, and 3 main rules.  The rules are the following:
  arr[0….low-1] contains 0. [Extreme left part]
  arr[low….mid-1] contains 1.
  arr[high+1….n-1] contains 2. [Extreme right part], n = size of the array
 */

public class Sort_an_array_of_0_1_2{

     public static void sort012(int[] arr)
    {
        int n = arr.length;
        int low = 0; int mid = 0; int high = n-1;

        while(mid<=high){
            if(arr[mid] == 0){
                int temp = 0;
                temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }
            else if( arr[mid] == 1){
                mid++;
            }
            else{
               int temp=0;
               temp = arr[mid];
               arr[mid] = arr[high];
               arr[high] = temp;
               high--;
            }
        }
    }
    
    public static void main(String[] args){

    int[] arr = {0, 2, 1, 2, 0, 1};
    System.out.println(Arrays.toString(arr));
    sort012(arr);
    System.out.println(Arrays.toString(arr));
        
    }
}
/*
 * Approach:

   Note: Here in this tutorial we will work based on the value of the mid pointer.

  The steps will be the following:

   First, we will run a loop that will continue until mid <= high.
   There can be three different values of mid pointer i.e. arr[mid]
   If arr[mid] == 0, we will swap arr[low] and arr[mid] and will increment both low and mid. Now the subarray from index 0 to (low-1) only contains 0.
  If arr[mid] == 1, we will just increment the mid pointer and then the index (mid-1) will point to 1 as it should according to the rules.
  If arr[mid] == 2, we will swap arr[mid] and arr[high] and will decrement high. Now the subarray from index high+1 to (n-1) only contains 2.
  In this step, we will do nothing to the mid-pointer as even after swapping, the subarray from mid to high(after decrementing high) might be unsorted. So, we will check the value of mid again in the next iteration.
  Finally, our array should be sorted.

 */
