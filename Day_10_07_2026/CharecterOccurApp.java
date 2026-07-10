//11. Count the occurrences of a particular character.
import java.util.*;
class CharecterOccurApp
{
     public static void main(String args[])
     {
          Scanner sc=new Scanner(System.in);
          char ch[]=new char[10];
        
          System.out.println("Enter the Cahrecter "+ch.length);
         
          for(int i=0;i<ch.length;i++)
          {
             ch[i]=sc.next().charAt(0);
          }
               char c=sc.next().charAt(0);  
          int count =0;
          for(int i=0;i<ch.length;i++)
          {
             if(ch[i]==c)
             {
                   count++;
             }
        
          } 
          System.out.println("Occurence is count is "+count);
    }
}