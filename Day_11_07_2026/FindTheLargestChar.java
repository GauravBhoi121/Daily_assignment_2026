//21. Find the largest character in a string.
import java.util.*;
class FindTheLargestChar
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      
        String s=sc.nextLine();
        char max='0';
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>max)
               max=s.charAt(i);
        }
        System.out.println(" Max "+max);
        
    }
}