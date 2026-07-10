//17. Replace all spaces with hyphens.
import java.util.*;
class ReplaceAllSpace
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       String s2="";
      for(int i=0;i<s.length();i++)
      {
         if(s.charAt(i)==' ')
         {
            s2+='-';
         }
         else
         {
            s2+=s.charAt(i);
         }
      }
      System.out.println(s2);
    }
}