//22. Find the smallest character in a string.
import java.util.*;
class FindTheSmallest
{
     public static void main(String args[])
     {
          Scanner sc=new Scanner(System.in);
          String s=sc.nextLine();
          char min='z';
          for(int i=0;i<s.length();i++)
          {
             if(s.charAt(i)<min && s.charAt(i)!=' ')
             {
                 min=s.charAt(i);
             }
          }
          System.out.println(" min value  "+min);
     }
}