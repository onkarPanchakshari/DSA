package Recursion.Level_2;
public class Skip_Char_From_String {
    //input = baccda 
    //output = bccd

    // int this type of problem we have to skip the char which they tell to us
    // approach:-
    // pass the ans string in arrgument - this can be passed to function calls
    // crate the ans variable in fuction body - new far new function call 

    static void skip(String p , String up) // as per we passing string as arggument and creat variable p as the ans
    {
        if(up.isEmpty())
        {
            System.out.println(p); // if up is empty then 1st is our ans is complit ans stores in p so print p 
            //2nd is the when string is print ans as empty
            return ;
        }

        char ch = up.charAt(0); // we get the char at possition index 0

        if(ch == 'a'){
            //here we compare that char to which chre we have to skip
            skip(p, up.substring(1)); // after that we call function agian and but this time we chage the string we start from index 1
        }
        else{
            //here when ch is not match then we add that char to our ans variable string then again call function with substring
            skip(p+ch, up.substring(1));
        }
    }


    public static void main(String[] args) {
        
        String up = "baccda";
        skip("", up);
    
    }
}
