package Sorting;

import java.util.Arrays;

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