import java.util.ArrayList;
import java.util.Scanner;

class Book {
    int id;
    String title;
    String author;
    int copies;

    Book(int id, String title, String author, int copies) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.copies = copies;
    }
}

public class Task4 {
    public static void main(String[] args) {
        boolean f=false;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Book ID = ");
        int searchId = sc.nextInt();
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(101, "Pralay", "Nagraj", 3));
        books.add(new Book(102, "Vinash", "Dhruv", 4));
        books.add(new Book(103, "Jaljala", "Doga", 7));
        books.add(new Book(104, "Kohram", "Permanu", 2));
        for (Book b : books) {
            if (b.id == searchId) {
                f=true;
                System.out.println("Book Found");
                System.out.println("id= " + b.id);
                System.out.println("title= " + b.title);
                System.out.println("author= " + b.author);
                System.out.println("copies= " + b.copies);

            }
        }
        if(f==false){
            System.out.println("Book does not exists");
        }
    }
}