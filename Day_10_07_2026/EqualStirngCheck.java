//18. Compare two strings without using `equals()`.
import java.util.*;
class EqualStirngCheck
{
     public static void main(String args[])
     {
        Scanner sc=new Scanner(System.in);
        String s2=sc.nextLine();
        String s1=sc.nextLine();
        if(s1==s2)
        {
           System.out.println("Equals ");
        }
        else
        {
           System.out.println("Not Equal");
        }
     }
}