//Cannot create object of interface but can create its reference 
interface Test
{ 
   void show();
}
class TestChild implements Test
{
    public void show()
    {
       System.out.println("I am Show Method in TestChild");
    }
}
public class ChildTestApp
{
    public static void main(String args[])
    {
        Test t= new TestChild();
        t.show();
     }
}  