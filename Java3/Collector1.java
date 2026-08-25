//import java.util.stream.Collectors;
import java.util.List;
public class Collector1{
    public static void main(String[] args) {
        List<Integer>list1=List.of(13,18,17,29,32,48,16,34,27);
         List<Integer>result=list1.stream()
                  .filter(n->n%2!=0)
                  //.collect(Collectors.toList());
                  .toList();
                System.out.print(result);
                  
    }
}
