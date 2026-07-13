//37. Reverse the order of words in a sentence.
import java.util.*;
class ReversTheOrder
{
    public static void main(String args[])
    { 
         Scanner sc=new Scanner(System.in);
         String s=sc.nextLine();
         String ss[]=s.split(" ");
         for(int i=ss.length-1;i>=0;i--)
         {
            System.out.print(ss[i]+" ");
         }
    }
}