package Recursion.Level_2;

public class Palindrome {

    public static boolean Ispalindrome(int i , String s )
    {
        if(i >= s.length()/2) return true;
        if(s.charAt(i) != s.charAt(s.length()-i-1))
            return false;
        
        return Ispalindrome(i+1, s);
    }

    public static void main(String[] args) {
        
        String s = "MADAM";
        int i =0;
        System.out.println("Is Palindrome:-" + Ispalindrome(i,s));
        

    }
}
