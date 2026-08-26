import java.util.List;
public class Rev7{
    public static void main(String[] args) {
        List<String>str= List.of("Ram", "Shyam", "Amit", "Ravi", "Mohan", "Anil", "Raj");
         str.stream()
         .distinct()
         .filter(n->n.length()>4)
         .sorted()
         .map(n->n.toUpperCase())
         .forEach(n->System.out.print(n+" "));
         long count = str.stream()
         .distinct()
         .filter(n->n.length()>4)
         .count();
         System.out.println("\ncount= "+count);
    }
}
    