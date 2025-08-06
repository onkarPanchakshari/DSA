package Array.Level_1;

public class Smallest_Number {
     public static void main(String[] args) {
        int[] arr ={15,18,56,84,3,6,7};
        
          int smallest = arr[0];
        for(int i =0; i< arr.length;i++){
            if(arr[i] < smallest){
                smallest=arr[i];
            }
        }
        System.out.println("Smallest number in the array is :- " + smallest);
    }
}
