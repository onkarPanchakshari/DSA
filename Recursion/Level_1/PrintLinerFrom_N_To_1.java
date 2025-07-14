public class PrintLinerFrom_N_To_1{

    static void  Numbers(int i )
    {
        if(i<=0)
        {
            return ;
        }
        System.out.println(i);
        Numbers(i-1);
    }
    public static void main(String[] args) {
        int i = 10;
        Numbers(i);
    }
}