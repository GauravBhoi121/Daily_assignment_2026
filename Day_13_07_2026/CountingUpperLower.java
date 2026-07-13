/*32. Count uppercase and lowercase letters separately.
*/
import java.util.*;
class CountingUpperLower
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       int UpperCount=0;
       int LowerCount=0;
       for(int i=0;i<s.length();i++)
       {
           if(Character.isUpperCase(s.charAt(i)))
           {
              UpperCount ++;
           }
           else if(Character.isLowerCase(s.charAt(i)))
           {
                 LowerCount ++;
           }
       }
       System.out.println(UpperCount+"<--Upper    Lower--->"+ LowerCount);
    }
}