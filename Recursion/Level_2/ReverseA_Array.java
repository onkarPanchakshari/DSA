package Recursion.Level_2;

import java.util.Arrays;

public class ReverseA_Array {

    //in this problem we have to reverse the array by using recusion 
    
    public static void Revers(int i ,int[] arr, int n)  //here we create the recusion function which have parmeters
    {
        if(i == n/2) { //then this codtion return if our pointer which is i come in middel or array because as we know that if point come it at middel then array is reversed
            return;
        }
        else {
            int a = arr[i]; //in this condtion we swapping the element to we create the on variable & store the value at index i to that decared variable
            arr[i] = arr[n-i-1];//them swich value to insex i by value at the end of array to find last element we use n-i-1(expalnation is below of code) then we swap the value
            arr[n-i-1] = a; //then insert the first value wish we store in valaber to end index 

        }
        Revers(i+1,arr,n);//we calling function again by incresing index by 1
        
    }

    public static void main(String[] args) {
        int[] arr ={ 1 ,2, 3,5,6};
        int n =arr.length;
        int i = 0;
        System.out.println("Befor Revers" +Arrays.toString(arr));
        Revers(i,arr,n);
        System.out.println("After Revers" +Arrays.toString(arr));

    }
}

/*n-i-1 := suppose we have to get last element of array size "n" as we array indexing start from 0 so we have to start
          we decrese array size by -1 it will be 4 then for accesing index by reverse way we have -i 
          this will understand by this way suppose we have to reverse or swap the number at index 1 to it reverse array index or our example 
          it is 3  to access that we can use this formula like n=5,i=1 then 5-1-1 =3 we get what we want */