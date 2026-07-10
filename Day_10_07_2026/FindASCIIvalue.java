//16. Find the ASCII value of each character.
import java.util.*;
class FindASCIIvalue
{ 
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       char c[]={'a','a','b','c','e','f'};
      System.out.println("Enter the cahrecter ");
   
      for (int i =0;i<c.length;i++)
      {
        int temp=c[i];
        System.out.println(c[i]+"  Ascii value is = "+temp);
      }
  }
}