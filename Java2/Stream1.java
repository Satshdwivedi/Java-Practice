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

public class Stream1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Book ID = ");
        int searchId = sc.nextInt();
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(101, "Pralay", "Nagraj", 3));
        books.add(new Book(102, "Vinash", "Dhruv", 4));
        books.add(new Book(103, "Jaljala", "Doga", 7));
        books.add(new Book(104, "Kohram", "Permanu", 2));
             Book fb=books.stream()
               .filter(b ->b.id==searchId)
               .findFirst()
               .orElse(null);
              if(fb==null)
                System.out.println("Book does not exist");
              else if(fb.copies>0){
                fb.copies--;
                System.out.println("Book borrowed");
                System.out.println("id= "+fb.id);
                System.out.println("title= "+fb.title);
                System.out.println("author= "+fb.author);
                System.out.println("copies= "+fb.copies);  
               }
            else{
                System.out.println("No copies available");
            }

}
}
