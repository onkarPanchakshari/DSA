package Array.Level_1;

import java.util.ArrayList;

/*
 * In this problem we have to write array of same  number having  both array which are sorted in nature 
 * 
 */
public class Intersection_Of_two_sorted_array {



    public static void main(String[] args) {
    
    int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int arr2[] = {2, 3, 4, 4, 5, 11, 12};
    ArrayList<Integer> Insertion = FindInsertion(arr1, arr2);
    System.out.println("Union of arr1 and arr2 is ");
    for (int val: Insertion)
     System.out.print(val+" ");
    }
    
}
