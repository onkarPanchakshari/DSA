package Sorting;

import java.util.Arrays;

/* In hte selection sort as per name we select the element and swap it 
 * - it will sort the array by the increaing order 
 * - it solve by two pointer approact 
 * -one pointer stands starting second comparie (full explaination in the notebook)
 * - explain is belowe of the code
 * 
 *   Note - time Complexity of this algo is O(n^2)
 */

public class Selection_Sort {

    public static void SelectionSort(int arr[]){

        for(int i = 0; i <= arr.length-2 ; i++ ){  
            int mini = i;
            for(int j = i ; j <= arr.length-1;j++)
            {
                if(arr[j] < arr[mini]){
                    mini = j;
                }
            }
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
    }


    public static void main(String[] args) {
        
        int[] arr = { 13 , 15 , 18 , 25, 9};
        System.out.println("Before Sorting the Array:-"+Arrays.toString(arr));
        SelectionSort(arr);
        System.out.println("After Sorting the Array:-" + Arrays.toString(arr));
    }
    
}

/*
 * lt understand by the example given {13 , 15 , 18 , 25, 9 }
 * 
 * first understand why we set loop i = 0 ; i <= arr.length-2; i++
 * let understand by follwing way
 * 
 * 0    1    2    3    4 (index)
 * 9  15   18   25    13 (step 1 which one number is minimun swap it to index 0 here is 9) 
 * 9  13   18   25    15 (Step 2 in second iteration i is incrsea by 1 so j start from 1 and find minimun and swap to starting )
 * 9  13   15   25    18  (Step 3 in this step j =2 so it start find the minimun ans swap)
 * 9  13   15   18    25  (Step 4 in this step j =3 so it start find the minimun ans swap)
 * 
 * at the end we get sorted array so we se n-2 
 * as per above explaination we does not need to traver array for length-1 which end 
 * becouse our second array start from i 
 * so we know left side is oredy sorted so no need to start fron index 0 
 */