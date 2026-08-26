import java.util.List;
public class Rev1{
    public static void main(String[] args) {
        List<Integer>num= List.of(10,25,8,25,40,15,8,50,30);
         num.stream()
         .distinct()
         .sorted((a,b)->b-a)
         .filter(n->n>20)
         .forEach(n->System.out.print(n+" "));
         } }
