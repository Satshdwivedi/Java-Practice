import java.util.ArrayList;
import java.util.Scanner;

class Book1 {
    int id;
    String title;
    String author;
    int copies;

    Book1(int id, String title, String author, int copies) {
        this.id = id;  
        this.title = title;
        this.author = author;
        this.copies = copies;
    }
}

public class Scanner2 {
    public static void main(String[] args) {
        boolean f = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Book Title = ");
        String searchTitle = sc.nextLine();
        ArrayList<Book1> books = new ArrayList<>();
        books.add(new Book1(101, "Pralay", "Nagraj", 3));
        books.add(new Book1(102, "Vinash", "Dhruv", 4));
        books.add(new Book1(103, "Jaljala", "Doga", 7));
        books.add(new Book1(104, "Kohram", "Permanu", 2));
        for (Book1 b : books) {
            if (b.title.equals(searchTitle)) {
                f = true;
                System.out.println("Book Found");
                System.out.println("id= " + b.id);
                System.out.println("title= " + b.title);
                System.out.println("author= " + b.author);
                System.out.println("copies= " + b.copies);
                break;

            }
        }
        if (f == false) {
            System.out.println("Book does not exists");
        }
    }
}