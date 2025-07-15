package Recursion.Level_2;



public class ReverseA_String {

    public static String Revers( String s ){
     if(s.isEmpty())
     {
        return s;
     }
   
     return Revers(s.substring(1)) + s.charAt(0);

}



    public static void main(String[] args) {
        String s = "Hello";
        
        Revers(s);
        System.out.println(Revers(s));

    }
}
