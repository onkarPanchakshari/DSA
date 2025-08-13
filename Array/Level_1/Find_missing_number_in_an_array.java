package Array.Level_1;

/* Problem Statement: Given an integer N and an array of size N-1 containing N-1 numbers between 1 to N. 
                      Find the number(between 1 to N), that is not present in the given array. */
public class Find_missing_number_in_an_array {
    
    public static int missing(int[] arr){
        int n = arr.length+1;
        int start_Number = arr[0];
        int last_Number = n;

        int Sum =(last_Number*(last_Number+start_Number))/2;

        int AcSum=0;
        for(int i =0 ;i<arr.length;i++){
            AcSum = arr[i] +AcSum;
        }

        int miss = Sum - AcSum;

        return miss;
    }

    public static void main(String[] args) {
        int[] arr = { 11, 12 ,13, 14,16};
        int miss = missing(arr);
        System.out.println("Missing Number is in the given array is:" + miss);
    }
}
