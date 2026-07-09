/*2. Count Total Consonants
Problem Statement
Create class CountConsonant with methods:
void setString(String str)
int getConsonantCount()
Method Description
void setString(String str)
Accepts string from user.
int getConsonantCount()
Counts all consonants and returns count.
Example
Input: "Computer"
Output: 6
Explanation
Consonants are:
 C, m, p, t, r     */
import java.util.*;
class CountCounSonant
{
     String s;
     void setString(String s)
     {
        this.s=s;
     }
     int getConsonantCount()
     {int count =0;
         for(int i=0;i<s.length();i++)
         {
if(s.charAt(i)!='a'&& s.charAt(i)!='e'&& s.charAt(i)!='i'&& s.charAt(i)!='o'&& s.charAt(i)!='A'&& s.charAt(i)!='E' && s.charAt(i)!='I' && s.charAt(i)!='O'&& s.charAt(i)!='u'&& s.charAt(i)!='U' && s.charAt(i)!=' ')
         {count ++;}
         }
         return count;
     }
}
public class CountConsonantApp
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s="Computer";
        CountCounSonant cs=new CountCounSonant();
        cs.setString(s);
        int count=cs.getConsonantCount();
        System.out.println("Consonant count is = "+ count );
       
     }
}