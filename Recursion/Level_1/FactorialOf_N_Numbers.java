public class FactorialOf_N_Numbers {
    
    public static int fact(int n)
    {
        if( n == 1)
        {
            return 1; // now here we have to chage the base case because of if fact(n-1) call it go to 0 (Fact(1-1))
            // And if we write  n == 0 return 0; then it return 0 ans as we know every number multiply by 0 is 0 that will 
            // give us 0 so we have to change the base case 
        }

        return n * fact(n-1);
    }

    public static void main(String[] args) {
        
        int n = 5;

        System.out.println(fact(n));

    }
}
