//51. Find the shortest word in a sentence.
import java.util.*;
class ShortestSentence
{
     public static void main(String args[])
     {
           Scanner sc=new Scanner(System.in);
           String sent=sc.nextLine();
           
           String s[]=sent.split(" "); 
           int min=s[0].length();
           String ss="";
           for(int i=0;i<s.length;i++)
           {
                 if(s[i].length()<min)
                 {
                     ss=s[i];
                     min=s[i].length();
                  }
           }
            System.out.println("Stirng "+ss+"   "+min);
    }
}
