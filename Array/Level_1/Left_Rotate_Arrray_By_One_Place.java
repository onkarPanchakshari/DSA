package Array.Level_1;

import java.util.Arrays;

/*  Problem Statement: Given an array of 1 integers, left rotate the array by one place.

*/

public class Left_Rotate_Arrray_By_One_Place {
    

    public static void Rotate(int[] arr){
        int temp = arr[0];
        for(int i = 1; i < arr.length;i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        Rotate(arr);
        System.out.println(Arrays.toString(arr));
    }
}
