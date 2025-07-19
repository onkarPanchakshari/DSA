 package Hashing;

public class Find_Frquence_Of_Char {

    public static void main(String[] args) {
        
        /*
          problem :- Given the string: “abcdabefc” we are given some queries: [a, c, z]. 
          For each query, we need to find out how many times the character appears in the string. 
          For example, if the query is ‘a’ our answer would be 2, and if the query is ‘z’ the answer will be 0. 
         */

         String s = "abcdabefc" ; // decraring the first string or main string
         String queries = "aczd"; // element which we need to find how many time it comes in main string 

         int[] hash = new int[256]; // decrale the hash array which as limt of 256 it will cover all lowercase and uppercase

         for(int i = 0 ; i < s.length(); i++){
            hash[s.charAt(i)]++; //in this pointe where in for loop we travel s.length as we know the it follow the ASCII value
            //for example :-  for a ASCII value it 97 
            // for this we get char at s and increase the value of that hash array index
            //for this exaple first come a at hash[97] it will increae by +1
         }

         for(int i =0 ; i < queries.length();i++){
            System.out.println(queries.charAt(i)+" - " + hash[queries.charAt(i)]);
            //this loop for getting repation of chare from traveling queries  
            // for just at index i = 0 ther is a  sysout we pass the at i which is a and find that in hash array by the same ASCII
            //number for a = 97 hash[97] it will give 2 
         }

    }

    
}