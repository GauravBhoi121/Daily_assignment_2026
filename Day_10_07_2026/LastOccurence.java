//13. Find the last occurrence of a character.
import java.util.*;
class LastOccurence
{
      public static void main(String args[])
      {
         Scanner sc=new Scanner(System.in);
         char c[]=new char[10];
         int index=-1;
         System.out.println("enter the character ");
         for(int i=0;i<c.length;i++)
         {
            c[i]=sc.next().charAt(0);
         }
       
         System.out.println("enter the character ");
         char ch=sc.next().charAt(0);
         for(int i=c.length-1;i>=0;i--)
         {
           if(ch==c[i])
              index=i;
              break;
         }
         System.out.println(index);
    }
} 