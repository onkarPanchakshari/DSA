package Array.Level_1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Left_Rotate_an_array_by_K_places {

    /*  
    
    Rotate array by K elements
    Problem Statement: Given an array of integers, rotating array of elements by k elements either left or right.

     */

    public static void Rotate(int[] arr,int K){
        int n = arr.length ;
       if (n == 0)
      return;
    K = K % n;
    if (K > n)
      return;
    int[] temp = new int[K];
        for (int i = 0; i < K; i++) {
      temp[i] = arr[i];
    }
    for (int i = 0; i < n - K; i++) {
      arr[i] = arr[i + K];
    }
    for (int i = n - K; i < n; i++) {
      arr[i] = temp[i - n + K];
    }

    } 


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int k = 2;
        System.out.println(Arrays.toString(arr));
        Rotate(arr,k);
        System.out.println(Arrays.toString(arr));
        
    }
    
}
