import java.util.*;
interface A
{
    void show();
}
public class LambdaApp
{
  public static void main(String args[])
  {
        Scanner sc=new Scanner(System.in);
        ((A)()->System.out.println("Show method in Interface A")).show();
  }
}