package Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class bubble_Sort {

    public static void bubbleSort(int arr[]){
        int n = arr.length;
        
        for(int i = n-1; i >= 0 ; i-- ){
            int count = 0;
            for(int j = 0 ; j <= i-1 ; j++){
                if(arr[j] > arr[j+1]){
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
