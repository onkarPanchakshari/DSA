public class PrintLinerFrom_1_To_N {

    static void Numbers(int i ,int n)
    {
        if(i > n ){
            return;
        }
        System.out.println(i);  // if change the order of calling function this can make unexpected output
        
        Numbers(i+1, n);
        
    }
    public static void main(String[] args) {
        
        int i = 1;
        int n = 10;
        Numbers(i,n);
    }
}