//Note: above code represent the dynamic polymorphism
interface VehicalEngine
{
    void ShowEngine();
}
class Car implements VehicalEngine
{
      public void ShowEngine()
      {
         System.out.println("I am Car Engine ");
      }

}
class Bike implements VehicalEngine
{
   public void ShowEngine()
   {
       System.out.println("I am Bike Engine ");
   }
}
class ProductionApp
{
      public static void main(String args[])
      {
          VehicalEngine ve= null;
          ve=new Car();
          ve.ShowEngine();

          ve=new Bike();
          ve.ShowEngine();
         
      }
}