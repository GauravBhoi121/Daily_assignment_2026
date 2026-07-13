/*33. Toggle the case of each character. */
import java.util.*;
class ToggleString
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       String ss="";
       for(int i=0;i<s.length();i++)
       {
            if(Character.isUpperCase(s.charAt(i)))
            {ss+=(char)(s.charAt(i)+32);}
            else  if(Character.isLowerCase(s.charAt(i)))
            {ss+=(char)(s.charAt(i)-32);}
       }
       System.out.println("The String "+ss);
    }
}