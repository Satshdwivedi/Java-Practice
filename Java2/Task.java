import java.util.ArrayList;

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

public class Task {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(101, "Pralay", "Nagraj", 3));
        books.add(new Book(102, "Vinash", "Dhruv", 4));
        books.add(new Book(103, "Jaljala", "Doga", 7));
        books.add(new Book(104, "Kohram", "Permanu", 2));
        for (Book b : books) {
            System.out.println("id= " + b.id + " " + "title= " + b.title + " " + "author= " + b.author + " "
                    + "copies= " + b.copies);
        }
    }
}