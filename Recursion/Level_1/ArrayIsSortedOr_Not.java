public class ArrayIsSortedOr_Not {
    
    public static boolean SortedOrNot(int[] arr ,int index)
    {
        if(index == arr.length-1){
            return true;
        }

        return arr[index] < arr[index+1] && SortedOrNot(arr,index+1);
    }

    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5,6,7,8};

        System.out.println(SortedOrNot(arr,0));

    }
}
