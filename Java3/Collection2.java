import java.util.HashMap;
public class Collection2{
    public static void main(String[]args){
    HashMap<Integer,String>books=new HashMap<>();
     books.put(101,"Pralay");
     books.put(102,"Vinash");
     books.put(103,"jaljala");
     System.out.println(books.get(101));
     System.out.println(books.containsKey(102));
     System.out.println(books.containsValue("Vinash"));
     books.remove(103);
     System.out.println(books);
     System.out.println(books.size());
 }
}