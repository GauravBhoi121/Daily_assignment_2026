/*56. Print all suffixes of a string.
 */
import java.util.*;
class suffixesString
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
        for(int i=0;i<s.length();i++)
        {
           for(int j=i;j<s.length();j++)
           {
             System.out.print(""+s.charAt(j));
           }
             System.out.println("");
        }
    }
}