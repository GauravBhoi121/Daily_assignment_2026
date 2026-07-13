//38. Check whether two strings are anagrams.
import java.util.*;
class AnagramString 
{
      public static void main(String args[])
      {
           Scanner sc=new Scanner(System.in);
           String s=sc.nextLine();
           String s1=sc.nextLine();
           int count=0;
           if(s.length()!=s1.length())
           {
               System.out.println("String is not anagram");
           }
           char s2[]=s.toCharArray();
                    Arrays.sort(s2);
           char s3[]=s1.toCharArray();
                    Arrays.sort(s3);
           boolean b=false;
           for(int i=0;i<s2.length;i++)
           {
                if(s2[i]==s3[i])
                   b= true; 
                else 
                   b= false;
           }
         if(b)
          System.out.println("Anagram ");
         else 
          System.out.println("Anagram");

      }
}
