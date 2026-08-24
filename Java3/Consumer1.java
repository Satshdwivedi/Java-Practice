import java.util.function.Consumer;
public class Consumer1{
    public static void main(String[] args) {
        Consumer<Integer>c=n->System.out.println(Math.sqrt(n));
        c.accept(282);
    }
}