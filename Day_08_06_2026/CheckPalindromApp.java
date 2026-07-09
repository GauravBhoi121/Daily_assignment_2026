/*
4. Check Palindrome String
Problem Statement
Create class PalindromeCheck with methods:
void setString(String str)
boolean isPalindrome()
Method Description
void setString(String str)
Accepts string input.
boolean isPalindrome()
Checks whether string is palindrome or not and returns true or false.
Example
Input: "madam"
Output: true
Explanation
Original and reverse strings are same. */
import java.util.*;
abstract class Check
{
     abstract boolean check();
     abstract void setString(String s);
     
}
class PalindromeCheck extends Check
{String s;
      public void setString(String s)
      {
         this.s=s;
      }
      public boolean check()
      {
           int start=s.length()-1;
           int end = 0;
           boolean t=true;
          for(int i=0;i<=s.length()-1;i++)
          {
              if(s.charAt(i) != s.charAt(start))
              {      t=false;
                     break;    
              }
              start--;
          }
          return t;
             
      }
}
class CheckPalindromApp
{
     public static void main(String args[])
     {
         Scanner sc=new Scanner(System.in);
         String s="abbb"; 
         PalindromeCheck pd=new PalindromeCheck();
         pd.setString(s);
         boolean tf=pd.check();
         if(tf)
         {
             System.out.println("String is Palindrome");
         }
         else 
         {
             System.out.println("String is Not Palindrome");
         }
     }
}