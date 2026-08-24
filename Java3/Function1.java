import java.util.function.Function;
public class Function1{
    public static void main(String[] args) {
        Function<String,Double>f=name->Math.sqrt(name.length());
        System.out.println(f.apply("Knowledge"));
    }
}