package Array.Level_1;

public class Check_array_Is_Sorted_Or_not {
    public static boolean Check(int arr[]){

        for( int i = 1; i< arr.length;i++){
            if(arr[i] >= arr[i-1]){

            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr ={ 1,2,2,3,3,4,5,9,11};
        System.out.println("Array is shored or not:-" + Check(arr));
    }
}
