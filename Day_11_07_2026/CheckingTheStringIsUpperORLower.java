//25. Check whether a string contains only uppercase letters.
//26. Check whether a string contains only lowercase letters.
import java.util.*;
abstract class Check
{  
     abstract boolean show(String s);
}
class CheckUpper extends Check
{
   boolean show(String s)
   { 
       // boolean ss=true;
        for(int i=0;i<s.length();i++)
        {
             if(s.charAt(i)>='A' && s.charAt(i)<='Z')
              {
                 continue;                
              }
              else
             {
                       return false;
              }
         }
        return true;
   }
}
class CheckLower extends Check
{
   boolean show(String s)
   {     //boolean ss=true;
        for(int i=0;i<s.length();i++)
        {
             if(s.charAt(i)>='a' && s.charAt(i)<='z')
              {
                     continue;
              }
              else
              {
                  return false;
              }
        }
        return true;

   }
}
class CheckingTheStringIsUpperORLower
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      CheckUpper u=new CheckUpper();
      CheckLower l=new CheckLower();

      if(u.show(s))
      {
          System.out.println("Only Upper case");
      }
      else
      {
          System.out.println("Not Only Upper case");
      }
     if(l.show(s))
      {
          System.out.println("Only Lower case");
      }
      else
      {
          System.out.println("Not Only Lower case");
      }

   }
}
