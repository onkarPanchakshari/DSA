package Recursion.Level_2;

public class FiboaracciNumber {
    
    public static int fibo(int n)
    {
        if(n <= 1)
        {
            return n;
        }

        return fibo(n-1) + fibo(n-2);
    }

    public static void main(String[] args) {
        
        int n =4;
        System.out.println("Fiboaracci Number Of " +n +" is : "+ fibo(n));
    }
}
