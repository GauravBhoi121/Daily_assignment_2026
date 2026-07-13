//24. Check whether a string contains only alphabets.
import java.util.*;
class CheckAlphabets
{
      CheckAlphabets(String s)
      {
          boolean sh=false;
          for(int i=0;i<s.length();i++)
          {
              if(s.charAt(i)<='A' || s.charAt(i)>='z')
              {   sh=true;
                  break;
              }
              
          }
          if(!sh)
             System.out.println("Only Alphabets");
          else
              System.out.println("Not Only Alphabets");
        

      }
     public static void main(String args[])
     {
          Scanner sc=new Scanner(System.in);
          String s=sc.nextLine();
          new CheckAlphabets(s); 
     }
}