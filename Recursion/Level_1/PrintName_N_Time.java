public class PrintName_N_Time{

  
    static  void name(String name , int n)
    {
        int i = 1 ;
        if(i>n){
            return;
        }
        System.out.println("Onkar");
        name(name, n-1);
    }
    public static void main(String[] args) {

        int n = 5;
        String name = "onkar";
        name(name, n);
        
    }
}