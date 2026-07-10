//12 First Occurrence of character Array
import java.util.*;
class FirstOccurenceApp
{
      public static void main(String args[])
      {
          Scanner sc=new Scanner(System.in);
          char ch[]=new char[10];
          System.out.println("Enter the character");
          int index=-1;
          for(int i=0;i<ch.length;i++)
          {
             ch[i]=sc.next().charAt(0);
          }
          System.out.println("Enter the char ");
          char c=sc.next().charAt(0);
          for(int i=0;i<ch.length;i++)
          {
             if(ch[i]==c)
                index=i;
                 break;
          }
          System.out.println("Index Of character is "+index);
        
      }
}