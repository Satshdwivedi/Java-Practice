import java.util.HashSet;
import java.util.List;

public class Hashset1{
    public static void main(String[] args) {
List<Integer> list1 = List.of(10, 20, 30, 40, 50);
List<Integer> list2 = List.of(30, 40, 50, 60, 70);
        HashSet<Integer> s = new HashSet<>(list1);
          for(Integer n:list2){
            if(s.contains(n))
            System.out.println(n);
          }
    }
}
