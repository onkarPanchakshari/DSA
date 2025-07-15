package Recursion.Level_3;

public class Finde_Target_elementIndex {

    // this problem comes under the liner search recursion in which we have to find the element in array and have to give the index
   
    //to slove this type of problem we creat recuvive function
    
    public static int find(int[] arr, int target , int index) // this recursive function with parmeters
    {
        if(index == arr.length) //this codition for if index go at end of arr but we not able to find the targe then this will return -1
        {
            return -1;
        }

        //this conditon compair arr[index] with target if the number is match then we return the index 
        if(arr[index] == target)
        {
            return index;
        }else{
            //if we not get the target then we call this function again by incresing index
            return find(arr, target, index+1);
        }

        
    }

    public static void main(String[] args) {
        
        int[] arr={10,45,52,92,85,75};
        int target=92;
        System.out.println(find(arr, target, 0));
    }
}
