//35. Find the frequency of every character in a string.
import java.util.*;
class FrequentlyApp
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ch[]=s.toCharArray();
        
        for(int i=0;i<ch.length;i++)
        {     int count = 1;
             for(int j=i+1;j<ch.length;j++)
             {
                 if(ch[i]==ch[j])
                 {    count++;
                      ch[j]=0;
                 }
             }
             if(ch[i]!=0)
                System.out.println(ch[i]+"  count "+count);
        }
                
   }
} 
