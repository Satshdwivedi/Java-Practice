import java.util.List;
public class Stream2{
    public static void main(String[] args) {
        List<Integer>list=List.of(24,2,35,12,31,47,16,53);
        list.stream()
        //.sorted()
        .sorted((a,b)->b-a)
        .filter(n->n%2==0)
         .map(n->n*n)
         
        .forEach(n->System.out.print(n+" "));
        

 }
}