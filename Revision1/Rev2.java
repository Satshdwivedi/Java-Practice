import java.util.List;
public class Rev2{
    public static void main(String[] args) {
        List<String>str= List.of("Java", "Python", "Java", "C++", "Python", "JavaScript");
         str.stream()
         .distinct()
         .sorted((a,b)->b.length()-a.length())
         .filter(n->n.length()>4)
         .forEach(n->System.out.print(n+" "));
    }
}
