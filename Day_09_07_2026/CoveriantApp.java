abstract class Animal
{
     abstract Animal reproduce();
}
class Cat extends Animal
{
    Cat reproduce(){
      return new Cat();
    }
    void show()
    {
       System.out.println("this is the Cat ");
    }
}
class Dog extends Animal
{
     Dog reproduce()
     {
         return new Dog();
     }
     void show()
     {
         System.out.println("this is Dog ");
     }
}
public class CoveriantApp
{
    public static void main(String args[])
    {
          Dog d=new Dog().reproduce();
          d.show();
          Cat c=new Cat().reproduce();
          c.show();
          
    }
}