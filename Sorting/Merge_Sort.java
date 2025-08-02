package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class Merge_Sort {


    private static void Merge(int arr[], int start,int end, int mid){
        ArrayList<Integer> temp = new ArrayList<>();

        int left = start;
        int right = mid+1;

        //this while loop is merge the two array by comparing
        while (left <= mid && right <= end ) {
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
            
        }

        // if elements on the left half are still left //
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        //  if elements on the right half are still left //
        while(right <= end){
            temp.add(arr[right]);
            right++;
        }

        // transfering all elements from temporary to arr //
        for(int i = start; i <= end;i++){
            arr[i] = temp.get(i-start);
        }

    }

    public static void MergeSort(int arr[], int start, int end){
        if(start >= end){
            return;
        }
        int mid = start + (end - start)/2;
        MergeSort(arr,start,mid); //this recuestion for left array
        MergeSort(arr,  mid+1, end); //this one for the Right array
        Merge(arr,start,end,mid);

    }
    public static void main(String[] args) {
         int[] arr = { 13 , 15 , 18 , 25, 9};
        System.out.println("Before Sorting the Array:-"+Arrays.toString(arr));
        MergeSort(arr,0,arr.length-1);
        System.out.println("After Sorting the Array:-" + Arrays.toString(arr));
    }
}
