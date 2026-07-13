/* 34. Convert the first character to uppercase.    */
import java.util.*;
class ConvertFirstChar
{
     public static void main(String args[])
     {
         Scanner sc=new Scanner(System.in);
         String s=sc.nextLine(),ss="";
         for(int i=0;i<s.length();i++)
         {
            if(i==0 && Character.isLowerCase(s.charAt(i)))
            {
                  ss+=(char)(s.charAt(i)-32);
            }
            ss+=s.charAt(i);
        }
         System.out.println(ss);
     }
}