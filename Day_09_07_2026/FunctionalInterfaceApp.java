import java.util.*;
@FunctionalInterface
interface A
{
    void show();
}
class B
{
     void show()
     {
        System.out.println("this is the interface class in a ");
     }

}
class FunctionalInterfaceApp
{ 
     public static void main(String args[])
     {
         Scanner sc=new Scanner(System.in);
         A temp=new B();
         temp.show();
         
     }
}