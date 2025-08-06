package Array.Level_1;

public class Second_Smallest_number {

    
    public static int Ssmallest(int arr[]){
        int Smallest = arr[0];
        int sSmallest = -1;

        for(int i = 0 ; i< arr.length;i++){
            if(arr[i] < Smallest){
                Smallest = arr[i];
            }else if(arr[i] != sSmallest && arr[i] < Smallest)
            {
                sSmallest = arr[i];
            }
        }
        
        return sSmallest;
    }


    public static void main(String[] args) {
        int[] arr ={15,18,56,84,3,6,7,7};
        System.out.println("Second Smallest number in the array is :-"+ Ssmallest(arr) );
         //this is optimal solution and time complexity of optimal solution is O(n)
    
    }
    
}
