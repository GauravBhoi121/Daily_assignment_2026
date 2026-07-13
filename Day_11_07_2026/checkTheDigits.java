//23. Check whether a string contains only digits.
import java.util.*;
class checkTheDigits
{
     public static boolean check(String s)
     {
          
          for(int i=0;i<s.length();i++)
          {
              if(s.charAt(i)>='A')
              {
                   return false;
              }
          }
          return true;
     }
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
     String s=sc.nextLine();
    if(checkTheDigits.check(s))
     {
         System.out.println("only digits ");
      }
     else
     {
       System.out.println("Not only degits ");
     }
      
   }
}