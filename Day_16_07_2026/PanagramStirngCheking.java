/*53. Check whether a string is a pangram.
*/
import java.util.*;
class PanagramStirngCheking 
{
     public static void main(String args[])
     {
         Scanner sc=new Scanner(System.in);
         String s=sc.nextLine();
         char chh[]=s.toCharArray();
         int count =0;
         for(char ch='a';ch<='z';ch++)
         {
             for(int i=0;i<chh.length;i++)
             {
                 if(ch==chh[i])
                  {
                     chh[i]=0;
                     count++;
                      break;
                  }
             }
                  
         }
        if(count==26)
        {
          System.out.println("String is panagram "+count);
        }
        else
        {
             System.out.println("It Is not panagram"); 
     }
}