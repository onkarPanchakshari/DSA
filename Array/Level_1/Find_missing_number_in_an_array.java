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
/*
 * 
 * Intuition:
   We know that the summation of the first N numbers is (N*(N+1))/2. We can say this S1. 
   Now, in the given array, every number between 1 to N except one number is present. 
   So, if we add the numbers of the array (say S2), the difference between S1 and S2 will be the missing number. 
   Because, while adding all the numbers of the array, we did not add that particular number that is missing.

   Sum of first N numbers(S1) = (N*(N+1))/2
    Sum of all array elements(S2) = i = 0n-2a[i]
   The missing number = S1-S2

   Note : Here  N = last number and  1 = Start number i.e (last*(last+1))/2 is the unvirsal formula

   Approach:
   The steps are as follows:

   We will first calculate the summation of first N natural numbers(i.e. 1 to N) using the specified formula.
   Then we will add all the array elements using a loop.
   Finally, we will consider the difference between the summation of the first N natural numbers and the sum of the array elements.
   
   Dry run:
  
    Assume the given array is: {1, 2, 4, 5} and N = 5.
    Summation of 1 to 5 = (5*(5+1))/2 = 15
    Summation of array elements = 12
    So, the difference will be = 15 - 12 = 3. 
     And the missing number is also 3.
 */
