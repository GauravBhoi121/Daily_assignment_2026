//Interface can declare within class or class within interface also 
interface A
{
     void show();
     class M
     {
         void showM()
         {
             System.out.println("I am Show Method in the class M ");
         }
      }
}
class B extends A.M implements A
{
       public void show()
       { 
          System.out.println("I am Show Method ");
       }
}
class NextInfApp
{
     public static void main(String args[])
     {
          B temp=new B();
          temp.show();
          temp.showM();
     }
}
            