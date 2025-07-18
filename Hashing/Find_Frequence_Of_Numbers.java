package Hashing;

public class Find_Frequence_Of_Numbers {
    
    /*
     Problem Statement :- Given an array of integers: [1, 2, 1, 3, 2] and we are given some queries: [1, 3, 4, 2, 10]. For each query, we need to find out how many times the number appears in the array. For example, if the query is 1 our answer would be 2, and if the query is 4 the answer will be 0. 

       output:- 1 - 2 , 3-1,2-2, 4-0, 10-4
     */

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 2};
        int[] queries = {1, 3, 4, 2, 10};

        int[] hash = new int[13];

        for(int i =0 ; i< arr.length ;i++){
            hash[arr[i]]++;
        }

        for(int q =0 ;q < queries.length; q++){
            System.out.println(queries[q]+"-"+ hash[queries[]]);
        }
    }


}
