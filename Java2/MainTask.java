import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

//Book class
class Book {
    int id;
    String title;
    String author;
    String category;
    int copies;

    Book(int id, String title, String author, String category, int copies) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.category = category;
        this.copies = copies;
    }
}

// Member class
class Member {
    int id;
    String name;
    String email;
    long phone;

    public Member(int id, String name, String email, long phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    int getBorrowLimit() {
        return 0;
    }
}

class Student extends Member {
    public Student(int id, String name, String email, long phone) {
        super(id, name, email, phone);
    }

    @Override
    int getBorrowLimit() {
        return 3;
    }
}

class Faculty extends Member {
    public Faculty(int id, String name, String email, long phone) {
        super(id, name, email, phone);
    }

    @Override
    int getBorrowLimit() {
        return 5;
    }
}

class BorrowRecord {
    Member member;// jis tarah hum reference object banete hai waise hi reference variable banaye
                  // hai
    Book book;// same here also jinka type hai unka capital form

    public BorrowRecord(Member member, Book book) {
        this.member = member;
        this.book = book;
    }
}

public class MainTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Book> books = new ArrayList<>();
        List<Member> member = new ArrayList<>();
        List<BorrowRecord> borrow = new ArrayList<>();
        boolean running=true;
        while(running)
        {
        System.out.println("1.Add Book");
        System.out.println("2.Add Member");
        System.out.println("3.Display Book");
        System.out.println("4.Search Book");
        System.out.println("5.Borrow Book");
        System.out.println("6.Return Book");
        System.out.println("7.Show Borrowed Book");
        System.out.println("8.Exit");

        System.out.print("Enter Choice= ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
               { System.out.print("Enter Book ID = ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Book Title = ");
                String title = sc.nextLine();

                System.out.print("Enter Author = ");
                String author = sc.nextLine();

                System.out.print("Enter Category = ");
                String category = sc.nextLine();

                System.out.print("Enter Copies = ");
                int copies = sc.nextInt();

                Book newBook = new Book(id, title, author, category, copies);

                books.add(newBook);

                System.out.println("Book added successfully");
                break;}
            case 2:
                {sc.nextLine();
                System.out.print("Enter Member Type (Student/Faculty)= ");
                String type = sc.nextLine();

                System.out.print("Enter Member ID= ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Name= ");
                String name = sc.nextLine();

                System.out.print("Enter email id= ");
                String email = sc.nextLine();

                System.out.print("Enter Phone No.= ");
                long phone = sc.nextLong();

                if (type.equalsIgnoreCase("Student")) {
                    member.add(new Student(id, name, email, phone));
                } else if (type.equalsIgnoreCase("Faculty")) {
                    member.add(new Faculty(id, name, email, phone));
                } else
                    System.out.println("Invalid Member");
                break;}
            case 3:
               { for (Book b : books) {
                    System.out.println("ID = " + b.id);
                    System.out.println("Title = " + b.title);
                    System.out.println("Author = " + b.author);
                    System.out.println("Category = " + b.category);
                    System.out.println("Available copies = " + b.copies);
                    System.out.println("-----------------------------");
                }
                break;}
            case 4:
               { System.out.print("Enter Book ID= ");
                int searchId = sc.nextInt();
                Book b = null;
                for (Book book : books) {
                    if (book.id == searchId) {
                        b = book;
                    }
                }
                if (b == null) {
                    System.out.println("Book does not exist");
                } else {
                    System.out.println("ID = " + b.id);
                    System.out.println("Title = " + b.title);
                    System.out.println("Author = " + b.author);
                    System.out.println("Category = " + b.category);
                    System.out.println("Available copies = " + b.copies);

                }
                break;}
                case 5:
                    { 
                        System.out.print("Enter Member ID= ");
                      int memberId = sc.nextInt();
                      Member m = null;
                      for (Member mem : member) {
                     if (mem.id == memberId) {
                        m = mem;
                     }
                     }
                   if   (m == null) {
                      System.out.println("Member does not exist");
                       break;
                    }
                    System.out.print("Enter Book ID = ");
                    int searchId = sc.nextInt();
                    Book b = null;
                     for (Book book : books) {
                        if (book.id == searchId) {
                            b = book;
                        }
                    }
                           if (b == null) {
                             System.out.println("Book does not exist");
                        break;
                    }
                       boolean alreadyBorrowed = false;
                        int count = 0;
                     for (BorrowRecord br : borrow) {
                      if (br.member.id == m.id) {
                        count++;
                     }
                      if (br.member.id == m.id && br.book.id == b.id) {
                            alreadyBorrowed = true;
                    }
                     }
                      if (alreadyBorrowed) {
                        System.out.println("Member already borrowed this book");
                     } else if (count >= m.getBorrowLimit())
                       System.out.println("borrowed limit reached");

                     else if (alreadyBorrowed == false) {
                       if (b.copies > 0) {
                        b.copies--;
                        BorrowRecord bor = new BorrowRecord(m, b);
                        borrow.add(bor);
                        System.out.println("Book borrowed successfully");

                    } else
                        System.out.println("No copies available");
                }
                
                   break;}
             case 6:
                     {    System.out.print("Enter Member ID= ");  
                        int  memberId=sc.nextInt(); 
                         System.out.print("Enter Book ID= ");   
                         int bookId=sc.nextInt(); 
                         boolean found = false;
                      for (int i = 0; i < borrow.size(); i++) {
                     if (borrow.get(i).member.id == memberId && borrow.get(i).book.id == bookId) {
                                    found = true;
                                     borrow.get(i).book.copies++;
                                     borrow.remove(i);
                                     System.out.println("Book returned Successfully");
                               break;
                        }
                              }
                      if (found == false) {
                             System.out.println("Member is return the book they have not borrowed ");
                            }                              
                               break;}
              case 7:
                          {  System.out.print("Enter Member ID = ");
                              int  memberId = sc.nextInt();
                              boolean  found = false;
                           for (BorrowRecord br : borrow) {
                            if (br.member.id == memberId) {
                            System.out.println(br.book.title);
                                    found = true;
                                 }
                                }
                             if (found == false) {
                             System.out.println("No borrowed books found");
                                   }
                         break;  } 
                case 8:
                       {  System.out.println("Exit");
                         running=false;
                         break;}
                default :
                        System.out.println("Invalid Choice");
    }
}
}
}
