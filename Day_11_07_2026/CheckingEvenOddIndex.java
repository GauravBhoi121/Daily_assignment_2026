//27. Print characters at even indexes.
//28. Print characters at odd indexes.
import java.util.*;
interface Check
{
    void showCheck(String s);
}
class Even implements Check
{
    public void showCheck(String s)
    {
          System.out.println("Print Event Index Character ");
          for(int i=0;i<s.length();i++)
          {
              if(i%2==0)
                  System.out.println("indeex "+i+"  "+s.charAt(i));
          }

    }
}
class Odd implements Check
{ 
  public void showCheck(String s)
  {
          System.out.println("Print Odd Index Character ");
          for(int i=0;i<s.length();i++)
          {
                if(i%2!=0)
               System.out.println("indeex "+i+"  "+s.charAt(i));
          }
  }  
}
class CheckingEvenOddIndex
{
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
         String s=sc.nextLine();
         Odd oo=new Odd();
         oo.showCheck(s);
         Even ev=new Even();
         ev.showCheck(s);
    }
}
