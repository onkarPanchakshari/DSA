package Array.Level_1;

public class Largest_Number {
    
    /*
     * in this problem we have to find the larh=gest number in the array
     */
    public static void main(String[] args) {
        int[] arr ={15,18,56,84,3,6,7};
        
          int largest = arr[0];
        for(int i =0; i< arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println("Largest number in the array is" +largest);
    }
}
