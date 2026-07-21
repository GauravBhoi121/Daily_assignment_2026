/*     
52. Check whether one string is a rotation of another.
*/
import java.util.*;
class CheckStringRotetion
{
      public static void main(String args[])
      {
          Scanner sc=new Scanner(System.in);
          String s1=sc.nextLine();
          String s2=sc.nextLine();
          if(s1.length()!=s2.length())
          {
             System.out.println("this is the not same size String ");
          }
          else
          {
                   int f=0;
                  for(int i=s1.length()-1;i>=0;i--)
                  {      
                      if(s1.charAt(i)==s2.charAt(f++))
                       {
                             continue;
                       }
                       else
                       {
                              System.out.println("Stirng is not Equal");
                       }
                  }
           }
                      
                
      }
}