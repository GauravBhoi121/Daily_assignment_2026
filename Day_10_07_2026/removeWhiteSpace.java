//14. Remove all white spaces from a string
import java.util.*;
class removeWhiteSpace
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       String s2="";
       for(int i=0;i<s.length();i++)
       {
           if(s.charAt(i)!=' ')
           {
              s2+=s.charAt(i);
           }
       }
       System.out.println(s2);
       
   }
}