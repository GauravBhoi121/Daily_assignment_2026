/*Question 60: Write a Java program to implement Sales Management System with full CRUD operations.
Create a POJO class Sales with attributes salesId, salesAmount, and productId.
Store records using array of objects.
Menu Operations:
1. Add Sales Record 2. Display Sales Records 3. Search Sales by Id
4. Update Sales Amount 5. Delete Sales Record 6. Calculate Total Sales
7. Find Maximum Sales 8. Find Minimum Sales 9. Calculate Average Sales 10. Exit    */
import java.util.*;
class Sales
{
   private int SalesId; 
   private int SalesAmount;
   private int ProductId;
   Sales(int sid,int pid,int aid)
   {
       this.SalesId=sid;
       this.SalesAmount=aid;
       this.ProductId=pid;
   }
   
    public void setSalesId(int id)
    {
        this.SalesId=id;
    }
    public int getSalesId()
    {
         return SalesId;
    }
    public void setSalesAmount(int id)
    {
        this.SalesAmount=id;
    }
    public int getSalesAmount()
    {
         return SalesAmount;
    }    
    public void setProductId(int id)
    {
        this.ProductId=id;
    }
    public int getProductId( )
    {
         return ProductId;
    }
}
class OpretionApp
{
     Sales sl[];
     public void addProduct(Sales sl[])
     {
       this.sl=sl;
     }
     public void display()
     {
        for(int i=0;i<sl.length;i++)
        {
            System.out.println(sl[i].getSalesId()+" "+sl[i].getSalesAmount()+" "+sl[i].getProductId());
        }
     }
}
class ProductionHouse
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        Sales s[]=new Sales[3];
      for(int i=0;i<s.length;i++)
      {
        int sal=sc.nextInt();
        int pro= sc.nextInt();
        int amt= sc.nextInt();
        Sales ss=new Sales(sal,pro,amt);
        s[i]=ss;
     }
       
        OpretionApp op=new OpretionApp();
        op.addProduct(s);
        op.display();
       
       
    }
}