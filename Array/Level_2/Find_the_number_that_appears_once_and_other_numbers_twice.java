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
