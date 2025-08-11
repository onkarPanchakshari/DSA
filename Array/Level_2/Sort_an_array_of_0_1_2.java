package Array.Level_2;

import java.util.Arrays;

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
