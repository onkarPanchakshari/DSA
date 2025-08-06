package Array.Level_1;

public class Second_LargestNumber {
    
    public static int SLargest(int arr[]){
        int largest = arr[0];
        int slargest = -1;

        for(int i = 0 ; i< arr.length;i++){
            if(arr[i] > largest){
                largest = arr[i];
            }else if(arr[i] > slargest && arr[i] < largest)
            {
                slargest = arr[i];
            }
        }
        
        return slargest;
    }


    public static void main(String[] args) {
        int[] arr ={15,18,56,84,3,6,7,7};
        System.out.println("Second Largest number in the array is :-"+ SLargest(arr) );
         //this is optimal solution and time complexity of optimal solution is O(n)
    
    }

    /*  following is better solution
     * 
     *  we find first larget number as 
     * 
      */

    }