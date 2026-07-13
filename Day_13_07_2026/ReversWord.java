//36. Reverse each word in a sentence.
import java.util.*;
class ReversWord
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       String sen=sc.nextLine();
       String ss[]=sen.split(" ");
       for(int i=0;i<ss.length;i++)
       {
         for(int j=ss[i].length()-1;j>=0;j--)
        {
          System.out.print(ss[i].charAt(j));
        }
          System.out.println(""); 
       }
      
   }
}