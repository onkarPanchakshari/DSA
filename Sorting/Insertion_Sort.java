package Sorting;

import java.util.Arrays;

public class Insertion_Sort {

    
    
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
