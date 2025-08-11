package Array.Level_1;

import java.util.Arrays;

public class Remove_Dupicate {

    public static int removeDupicate(int[] arr){
        int i = 0;
        for( int j = 1; j < arr.length; j++){
            if( arr[i] != arr[j]){
                i++;
                arr[i] =arr[j];
            }
        }
        return i +1;
    }
    
    public static void main(String[] args) {
        int[] arr ={1,1,2,2,2,3,3};
        System.out.println(Arrays.toString(arr));
        int s = removeDupicate(arr);
        System.out.println(s);

    }
}
