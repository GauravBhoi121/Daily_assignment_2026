/*1. Count Total Vowels
Problem Statement
Create class name as CountVowel with two methods:
void setString(String str)
int getVowelCount()
Method Description
void setString(String str)
This method accepts a string as parameter and stores it inside class variable.
int getVowelCount()
This method counts total vowels (a, e, i, o, u) present in string and returns total count.
Example
Input: "Education"
Output: 5
Explanation
The vowels are:
 E, u, a, i, o
Total vowels = 5       */
import java.util.*;
class TotalVowel
{
    String s;
    void setString(String s)
    {this.s=s;
    }
    int getVowelCount()
    { int count =0;
       for(int i=0;i<s.length();i++)
       {
          if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='u'||s.charAt(i)=='U')
{
         count++;
}
    }
return count;
}
}
class TotalVowelCount
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s="GauravBhoi";
        TotalVowel tv=new TotalVowel();
        tv.setString(s);
        int TotalCount = tv.getVowelCount();
        System.out.println("Total Count = "+TotalCount);
    }
}     
 


      
