//29. Remove all digits from a string.
//30. Remove all special characters from a string.
import java.util.*;
interface Removing
{
    void remove(String s);
}
class Removedigits implements Removing 
{
     public void remove(String s)
     {
        String ss="";
        //System.out.println("Special Carecter is removing ");
        for(int i=0;i<s.length();i++)
        {
          if(s.charAt(i)>='0' && s.charAt(i)<='9')
          { 
            continue;
          }
          else{
              ss+=s.charAt(i);
          }
       }
       System.out.println("After removing "+ss);
     
     }
}
class RemoveSpacial implements Removing 
{
    public void remove(String s)
    {
        System.out.println("Digits is removing");
        String ss="";
        //System.out.println("Special Carecter is removing ");
        for(int i=0;i<s.length();i++)
        {
          if(s.charAt(i)>='!' && s.charAt(i)<='/' ||  s.charAt(i)>=':' && s.charAt(i)<='@' )
          { 
               continue;
          }
          else{
              ss+=s.charAt(i);
          }
       }
       System.out.println("After removing "+ss);

    }

}
class ParformOpretions
{
     public static void main(String args[])
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String ");
        String s=sc.nextLine();
        Removing dr=new Removedigits();
        dr.remove(s);
        Removing rs=new RemoveSpacial();
        rs.remove(s);
        
        
     }

}