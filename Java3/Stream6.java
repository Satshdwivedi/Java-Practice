import java.util.List;
public class Stream6{
    public static void main(String[] args) {
        List<Integer>list4=List.of(10, 20, 10, 30, 40, 20, 50, 30, 60);
boolean result=list4.stream()
           //.anyMatch(n->n==60);
            //.noneMatch(n->n%2!=0);
            .allMatch(n->n%2==0);
   System.out.println(result);
        }
}