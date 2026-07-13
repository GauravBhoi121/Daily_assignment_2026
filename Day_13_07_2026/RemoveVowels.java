/*
31. Remove all vowels from a string.
*/
import java.util.*;
class RemoveVowels
{
     public static void main(String args[])
     {
           Scanner sc=new Scanner(System.in);
           String s=sc.nextLine();
           String ss="";
           for(int i=0;i<s.length();i++)
           {
              if(s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='U' || s.charAt(i)=='O' || s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
              {
                  continue;
              }
              else{
              ss+=s.charAt(i);
             }
           }
           System.out.println(ss);
     }
}
