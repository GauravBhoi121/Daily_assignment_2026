/*54. Print all substrings of a string.
import java.util.*;
class PrintAllSubString
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);                      
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++)
        {
              String ss="";
            for(int j=i;j<s.length();j++)
            { 
               ss+=s.charAt(j);
               System.out.println(ss);
            }
            System.out.println();
        }
    }
}
