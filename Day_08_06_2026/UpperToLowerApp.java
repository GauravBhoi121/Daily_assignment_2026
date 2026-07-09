/*
5. Convert String to Uppercase
Problem Statement
Create class UpperCaseConvert with methods:
void setString(String str)
String getUpperCase()
Method Description
void setString(String str)
Stores string.
String getUpperCase()
Converts lowercase letters into uppercase and returns result.
Example
Input: "java"
Output: "JAVA"
===================================================================
6. Convert String to Lowercase
Problem Statement
Create class LowerCaseConvert with methods:
void setString(String str)
String getLowerCase()
Method Description
void setString(String str)
Accepts string.
String getLowerCase()
Converts uppercase letters into lowercase.
Example
Input: "JAVA"
Output: "java"
=============================*/
import java.util.*;
interface UpperCase
{
      void setString(String s);
      String getLowerCase();
}
interface LowerCase
{
    void setString(String s);
    String getUpperCase();
}
class Choise implements UpperCase,LowerCase
{
      String s;

           public void setString(String s)
           {
             this.s=s;
           }

          public String getUpperCase()
          {
            String ss="";
            for(int i=0;i<s.length();i++)
            {
              
            return s;
          }

          public String getLowerCase()
          {
            return s;
          } 

}
class UpperToLowerApp extends Choise
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       String s="Gaurav Bhoi";
       LowerCase lc=new Choise();
       UpperCase up=new Choise();
       lc.setString(s);
       up.setString(s);
       String l=up.getLowerCase();
       String u=lc.getUpperCase();
      System.out.println("Upper Case String  = "+ u);
      System.out.println("Lover Case String  = "+ l);

        
    }
}
   
