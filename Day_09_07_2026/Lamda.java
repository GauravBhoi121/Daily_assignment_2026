import java.util.*;
@FunctionalInterface 
interface A 
{
    void show();
}
public class Lamda
{
    public static void main(String args[])
    { 
         A temp=()->{System.out.println("I am Lamba Using Functional Interface ");};
         temp.show();
    }
}
       