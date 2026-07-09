/* 3. Reverse String
Problem Statement
Create class ReverseString with methods:
void setString(String str)
String getReverse()
Method Description
void setString(String str)
Stores string into variable.
String getReverse()
Returns reverse of string.
Example
Input: "Java"
Output: "avaJ"
Explanation
Characters are printed from last to first.  */
import java.util.*;
interface Revers
{
     
     void revers(String s);
     String getString();
}
class ReverseString implements Revers
{
     String s;
     public void revers(String s)
     {
         this.s=s;
     }
     public String getString()
     {
         String rev="";
         for(int i=s.length()-1;i>=0;i--)
         {
            rev +=s.charAt(i);
         }
        return rev;
     }
}
class ReverseStringApp
{
     public static void main(String args [])
     {
          Scanner sc=new Scanner(System.in);
          String s="GauravBhoi";
          Revers st=new ReverseString();
          st.revers(s);
          String temp=st.getString();
          System.out.println("Revers String is = "+temp);
         
     }
}




      