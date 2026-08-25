import java.util.List;
import java.util.Optional;
public class Stream3{
    public static void main(String[]args){
        List<Integer>lis=List.of(10,20,30,40,50);
        long count=lis.stream()
                 .count();
        System.out.println(count);
    Optional<Integer>result=lis.stream()
                       .findFirst();
         System.out.println(result.get());                       
    }
}