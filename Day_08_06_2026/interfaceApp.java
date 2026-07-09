//Interface can declare within class or class within interface also 
class A
{
     void showA()
     {
         System.out.println("I am Show Method in A ");
     }
     interface B
     {
        void show();
     }
}
class C extends A implements A.B
{
     public void show()
     {
        System.out.println();
     }
}
class interfaceApp
{
     public static void main(String args[])
     {
         C temp=new C();
         temp.show();
        temp.showA();
     }
}
