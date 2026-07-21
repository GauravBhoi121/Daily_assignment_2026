/*55. Print all prefixes of a string.    
*/
import java.util.*;
class PrefixesOfString
{
     public static void main(String args[])
     {
         Scanner sc=new Scanner(System.in);
         String s=sc.nextLine();

         for(int i=0;i<s.length();i++)
         {
            for(int j=0;j<i+1;j++)
            {
               System.out.print(""+s.charAt(j));
            }
               System.out.println("");  
         }
     }
}