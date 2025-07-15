package Recursion.Level_2;

import java.util.Arrays;

public class ReverseA_Array {
    
    public static void Revers(int i ,int[] arr, int n)
    {
        if(i == n/2) {
            return;
        }
        else {
            int a = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = a;

        }
        Revers(i+1,arr,n);
        
    }

    public static void main(String[] args) {
        int[] arr ={ 1 ,2, 3,5,6};
        int n =arr.length;
        int i = 0;
        System.out.println("Befor Revers" +Arrays.toString(arr));
        Revers(i,arr,n);
        System.out.println("After Revers" +Arrays.toString(arr));

    }
}
