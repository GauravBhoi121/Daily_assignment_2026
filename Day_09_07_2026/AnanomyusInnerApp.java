import java.util.*;
interface A
{
    void show();
}
class AnanomyusInnerApp
{
     public static void main(String args[])
     {
          Scanner sc=new Scanner(System.in);
         
           A temp =new A(){public void show(){System.out.println("Ananomyus Inner Class in java ");}};
           temp.show();
     }
}