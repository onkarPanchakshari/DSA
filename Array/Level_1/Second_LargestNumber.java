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
     *  we find first larget number as find in largest number qut and store this largest number in the int largest 
     * and then we travel 2nd time with with the array in this time compair accordingly
     * if(arr[i] > slargest && arr[i] < largest) then this store int the slargest variabale 
     * 
     * but by solving accordingly time complexity increased because we travel two loop's  which means O(n+n) 
     *  == O(2n)
     * 
     * i.e we use optimal solution 
      */

    }