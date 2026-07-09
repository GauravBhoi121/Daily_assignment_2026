//Method Hidin concept of we de fine Method Hiding using the child refrence then the childlogic get Executed and is we define //the parent refrence the the parent Logic Executed thie is the use of method Hiding
abstract class A
{
    public static void show()
    {
        System.out.println("this parent class ");
    }
}
class B extends A
{
  public static void show()
  {
      System.out.println("this is the child  class ");
  }
}
public class MethodHidingApp
{
    public static void main(String args[])
    {
        A temp=new B();
        temp.show();
        
       B temp2=new B();
       temp2.show();
    }
}