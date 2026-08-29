import java.util.function.Consumer;
public class New{
    public static void main(String[]args){
        Consumer<String>c=n->System.out.println(n);
        c.accept("Java");
        c.accept("Python");
        c.accept("SQL");
    }
}