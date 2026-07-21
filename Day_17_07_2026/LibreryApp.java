import java.util.*;
class User
{
    private String Name;
    private String Email;
    private String Contact;
    private String Id;
   
   public void setId(String Id)
   {
         this.Id=Id;
   }
   public String getId()
   {
      return Id;
   } 
   public void setName(String Name )
   {
      this.Name=Name;
   }
   public String getName()
   {
      return Name;
   }
   public String getEmail()
   {
       return Email;
   }
   public void setEmail(String Email)
   {
       this.Email=Email;
   }
   public void setContact(String Contact)
   {
      this.Contact=Contact;
   }
   public String getContact()
   {
      return Contact;
   }
    
}
class Books
{
     private String Id;
     private String BookName;
     private String AuthorName;
     private String BookPrice;
     private String BookStatus;
     static Books b[]=new Books[3]; 
     
     Books(String Id, String BookName,String AuthorName,String BookPrice,String BookStatus)
     {
           this.Id=Id;
           this.BookName=BookName;
           this.BookPrice=BookPrice;
           this.AuthorName=AuthorName;
           this.BookStatus=BookStatus;
     }
     public void setBookId(String Id)
     {
       this.Id=Id;
     }
     public String getBookId()
     {
         return Id;
     }
     public void setBookName(String BookName)
     {
        this.BookName=BookName;
     }
     public String getBookName()
     {
        return BookName;
     }
     public void setAuthorName(String AuthorName)
     {
        this.AuthorName=AuthorName;
     }
     public String getAuthorName()
     {
        return AuthorName;
     }
     public void setBookPrice(String BookPrice)
     {
        this.BookPrice=BookPrice;
     }
     public String getBookPrice()
     {
        return BookPrice;
     }
     public void setBookStatus(String BookStatus)
     {
          this.BookStatus=BookStatus;
     }
     public String getBookStatus()
     {
          if(BookStatus.equals("Available"))
           {
              return BookStatus;
           }
           else
           {
              return "Book_Is_Not_Available";
           }
     }
     
}
class AllocateBook
{
     static AllocateBook allocatebook[]=new AllocateBook[3];
     private String BookAllocateId;
     private String StudentId;

     public void setBookAllocateId(String BookAllocateId)
     {
         this.BookAllocateId=BookAllocateId;
     }
     public String getBookAllocateId()
     {
          return BookAllocateId;
     }
     public void setStudentId(String StudentId)
     {
          this.StudentId=StudentId;
     }
     public String getStudentId()
     {
            return StudentId;
     }
     
} 
class Member extends User
{
    static Member m[]=new Member[3];
    Member(String Id ,String Name,String Contact,String Email)
    {
       System.out.println("Memeber Add Successfully.......");
    }
    Member()
    {
         //System.out.println("Member Login Successfully.............");
    }
}
class Admin extends User
{
    Books b[]=new  Books[3];
    Member m[]=new Member[3];
    AllocateBook allocation[]=new AllocateBook[3];
   public void adminLogin()
   {
         System.out.println("Admin Login Successfully............."); 
         //Books book=new Books();
        
         Scanner sc=new Scanner(System.in);
        

         do{
         System.out.println("1. ADD NEW BOOK............."); 
         System.out.println("2. UPDATE BOOK............."); 
         System.out.println("3. DELETE BOOK............."); 
         System.out.println("4. SEARCH BOOK By ID............."); 
         System.out.println("5. VIEW ALL BOOK ............."); 

         System.out.println("6. Register member ............"); 
         System.out.println("7. Remove member............."); 
         System.out.println("8. View Members............."); 
         System.out.println("9. Allocate book to member............."); 
         System.out.println("10. View Issued Books............."); 
         System.out.println("11. View Returned Books............."); 
         System.out.println("12. Generate reports ............."); 
         System.out.println("13. Exit Press 0 ............."); 
         System.out.println("..........................................................................................");
         System.out.println("Enter the choice ............."); 

         int choice=sc.nextInt();
          switch(choice)
          {
                 case 1:
                          //System.out.println("Enter Book Name  Author Name  Book Price");
                          sc.nextLine(); 
                              for(int i=0;i<b.length;i++)
                              {
                                System.out.println("Enter Book Id");
                                String id=sc.nextLine();

                                System.out.println("Enter Book Name");
                                String name=sc.nextLine();

                                System.out.println("Enter Book Author Name  ");                              
                                String author=sc.nextLine();

                                System.out.println("Enter Book Price");
                                String price=sc.nextLine();
                                    
                                System.out.println("Enter Book Status ");
                                String status=sc.nextLine();

                                b[i]=new Books(id ,name,author,price,status);
                          
                                System.out.println("Book Add Successfully......");
                                
                              }
                          break;
                 case 2:
                          sc.nextLine();
                          System.out.println("Enter the book Id ");
                          String bookid=sc.nextLine();

                          System.out.println("Enter the what you chenge 1. id 2. Name 3.Author 4.All");
                          int chenge=sc.nextInt();

                          for(int i=0;i<b.length;i++)
                          {   String bookname; String authorname;
                              //System.out.println(Object.typeOf(bookid+"Book Id "+b[i].getBookId());
                             if(bookid.equals(b[i].getBookId()))
                             {
                                    sc.nextLine();
                                   if(chenge == 1)
                                   {
                                         System.out.println("Enter the Book Id ");
                                         bookid=sc.nextLine();
                                         b[i].setBookId(bookid); 
                                         System.out.println("Book Add Successfully");
                                   }
                                   else if(chenge == 2)
                                   {
                                        System.out.println("Enter the Book Name");
                                        bookname=sc.nextLine();
                                        b[i].setBookName(bookname);
                                        System.out.println("Book Name Add Successfully");    
                                   }
                                   else if(chenge == 3)
                                   {
                                       System.out.println("Enter the Book Author Name ");
                                       authorname=sc.nextLine();
                                       b[i].setAuthorName(authorname);
                                       System.out.println("Book Author Name Add Successfully");
                                      
                                   }
                                   else if(chenge == 4 )
                                    {
                                      sc.nextLine();
                                      System.out.println("Enter Book Name ");
                                      bookid=sc.nextLine();
                                      b[i].setBookId(bookid);

                                      System.out.println("Enter Author Name ");
                                      bookname=sc.nextLine();
                                      b[i].setBookName(bookname);

                                      System.out.println("Enter Price ");  
                                      authorname=sc.nextLine();
                                      b[i].setAuthorName(authorname); 
                                      System.out.println("Book Updte Successfully Add Successfully");
                                    
                                   }
                                   else
                                   {
                                      System.out.println("Wrong Choice");
                                   }
                               }
                               else
                               {
                                   System.out.println("Book Id Is Not Precent In The Book ....");
                                   break;
                               }
                            }
                                   

                          break;
                 case 3:
                          sc.nextLine();
                          System.out.println("Enter the Book Id ");
                          String id=sc.nextLine();
                          for(int i=0;i<b.length;i++)
                          {
                              if(b[i].getBookId().equals(id))
                              {
                                 b[i].setBookId("Null");
                                 System.out.println("Book is Delete Successfully");
                                 break;
                              }
                          }
                          break;
                 case 4:
                          sc.nextLine();
                          System.out.println("Search Book Using Book Id");
                          bookid=sc.nextLine();
                          for(int i=0;i<b.length;i++)
                          {
                             if(bookid.equals(b[i].getBookId()))
                             {
System.out.println("Book Id"+b[i].getBookId()+" BOOK NAME "+b[i].getBookName()+", AUTHOR NAME "+b[i].getAuthorName()+", BOOK PRICE "+b[i].getBookPrice()+" Book Status is "+b[i].getBookStatus());
                           
                             }
                             else
                             {
                                  System.out.println("Book Is not Present Or Your Id Is Wrong ");
                             }
                          }  
                          break;
                 case 5:
                         int BookCount=0;
                        for(int i=0;i<b.length;i++)
                        {
                          if(b[i].getBookId()!="Null")
                          {                         
System.out.println("Book Id"+b[i].getBookId()+" BOOK NAME "+b[i].getBookName()+", AUTHOR NAME "+b[i].getAuthorName()+", BOOK PRICE "+b[i].getBookPrice()+" Book Status "+b[i].getBookStatus());
                         }
                          
                        }                         
                          break;
                 case 6:
                          //System.out.println("Enter Id Name Contact Email");
                          sc.nextLine(); 
                              for(int i=0;i<m.length;i++)
                              {
                                 m[i]=new Member();
                                System.out.println("Enter Member Id");
                                id=sc.nextLine();

                                System.out.println("Enter Member Name");
                                String name=sc.nextLine();

                                System.out.println("Enter Contact  Name  ");                              
                                String contact=sc.nextLine();

                                System.out.println("Enter Member Email");
                                String email=sc.nextLine();

                                m[i].setId(id);
                                m[i].setName(name);
                                m[i].setContact(contact);
                                m[i].setEmail(email);
                          
                                System.out.println("New Member Add Successfully......");
                                
                              }
                          break;
                 case 7:
                          sc.nextLine();
                          System.out.println("Enter the MemberId ");
                          id=sc.nextLine();
                          for(int i=0;i<m.length;i++)
                          {
                              if(m[i].getId().equals(id))
                              {
                                 m[i].setId("Null");
                                 System.out.println("Book is Delete Successfully");
                                 break;
                              }
                          }
                          break;
                 case 8:
                         
                        for(int i=0;i<m.length;i++)
                        {
                          if(m[i].getId()!="Null")
                          {                         
System.out.println("Member Id"+m[i].getId()+" Member Name "+m[i].getName()+", Email "+m[i].getEmail()+", Member Contact "+m[i].getContact());
                         }
                          
                        }                         
                          break;
                 case 9:
                          System.out.println("Allocate the Book For the Memeber");
                          sc.nextLine();
                              System.out.println("Enter the Book Id");
                              bookid=sc.nextLine();
                              String StudId=sc.nextLine();
                          for(int i=0;i<allocation.length;i++)
                          {
                              allocation[i]=new AllocateBook(); 

                              for(int j=0;j<b.length;j++)
                              {
                                 if(bookid.equals(b[j].getBookId()))
                                 {
                                     if( b[j].getBookStatus().equals("Available"))
                                      {
                                           allocation[i].setBookAllocateId(bookid);
                                           allocation[i].setStudentId(StudId);
                                           b[i].setBookStatus("Not");
                                           System.out.println("Book Is Issue Successfully........");
                                      }
                                      else {  System.out.println("Book Is not Available Already Issues By Student");
                                              break;
                                      }
      
                                 }
                                 else
                                 {
                                      System.out.println("The Book Id is not Avalible");
                                      break;
                                 }
                              }
                          }
                             
                          sc.nextLine();
                          
                          break;
                 case 11:
                          break;
                 case 12:
                          break;
                 case 13:
                          break;
                default:
                          System.out.println("Wrong choice ........");
          }
             
         }while(true);
   }
    
}
class ValidateUser
{
    public void isValidUser(User user)
    {
          if(user.getName()=="Admin" && user.getEmail()=="admin@gmail.com")
          {
                Admin a=new Admin();
                a.adminLogin();
          }
          else if(user.getName()=="Member" && user.getEmail()=="member@gmail.com")
          {
             Member m=new Member();
          }
          else
          {
              System.out.println("Not A Valid User ");
          }
              
    }
}
class LibreryApp
{
     public static void main(String args[])
     {
         Scanner sc=new Scanner(System.in);

          Admin ad=new Admin();
          ad.setId("1");
          ad.setName("Admin");
          ad.setEmail("admin@gmail.com");
          ad.setContact("12345");

         ValidateUser valid=new ValidateUser();
         valid.isValidUser(ad);
          
         
     }
}
