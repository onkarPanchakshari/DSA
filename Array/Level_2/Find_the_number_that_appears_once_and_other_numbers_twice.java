package Array.Level_2;

public class Find_the_number_that_appears_once_and_other_numbers_twice {
    
    public static int getSingleElement(int[] arr){
        int xorr = 0;
        for(int i =0 ;i<arr.length;i++){
            xorr = xorr ^ arr[i];
        }
        return xorr;

    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};
        int ans = getSingleElement(arr);
        System.out.println("The single element is: " + ans);
    }
}
/*
 * Approach(Using XOR): 
Intuition:
Two important properties of XOR are the following:

XOR of two same numbers is always 0 i.e. a ^ a = 0. ←Property 1.
XOR of a number with 0 will result in the number itself i.e. 0 ^ a = a.  ←Property 2

Here all the numbers except the single number appear twice and so will form a pair. Now, if we perform XOR of all elements of the array, the XOR of each pair will result in 0 according to the XOR property 1. The result will be = 0 ^ (single number) = single number (according to property 2).

So, if we perform the XOR of all the numbers of the array elements, we will be left with a single number.

Approach:
We will just perform the XOR of all elements of the array using a loop and the final XOR will be the answer.
Dry run:

Assume the given array is: [4,1,2,1,2]
XOR of all elements = 4^1^2^1^2
      = 4 ^ (1^1) ^ (2^2)
      = 4 ^ 0 ^ 0 = 4^0 = 4
Hence, 4 is the single element in the array.
 * 
 */

 /*
  * We also have follwing approach :-
  Hashing using the map data structure: 
Intuition:
The intuition will be the same as the array hashing. 
The only difference here is we will use the map data structure for hashing instead of using another array for hashing.

Approach:
The steps are as follows:

First, we will declare a map.
Now, using a loop we will store the elements of the array along with their frequency in the map data structure.
Using another loop we will iterate over the map, and try to find the element for which the frequency is 1, and finally, we will return that particular element.

And Code is following:- 

public static int getSingleElement(int []arr) {
        //size of the array:
        int n = arr.length;

        // Declare the hashmap.
        // And hash the given array:
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int value = mpp.getOrDefault(arr[i], 0);
            mpp.put(arr[i], value + 1);
        }

        //Find the single element and return the answer:
        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if (it.getValue() == 1) {
                return it.getKey();
            }
        }

        //This line will never execute
        //if the array contains a single element.
        return -1;
    }
  */
