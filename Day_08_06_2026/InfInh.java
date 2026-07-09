//Interface to interface inheritance use extends keyword 
interface A
{
    void show();
}
interface B extends A
{
   
    void display();
}
class C implements B
{
     public void show()
     {
          System.out.println("I am Show method " );
     }
     public void display()
     {
          System.out.println(" I am Display Method ");
      }
}
class InfInh
{
     public static void main(String args[])
     {
         C temp=new C();
         temp.show();
         temp.display();
     }
}
