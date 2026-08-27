import java.util.TreeSet;
import java.util.List;
//treeset give no duplicate with default ascending order
public class Treeset{
    public static void main(String[] args) {
List<Integer> list1 = List.of(50,20,40,10,30);
        TreeSet<Integer> s = new TreeSet<>(list1);
                System.out.println(s.first());
                  System.out.println(s.last());
                  System.out.println(s);
                  System.out.println(s.higher(20));
                  System.out.println(s.lower(30));
                  s.remove(30);
                  System.out.println(s.contains(10));
                  
                  System.out.println(s);
          
        
    }
}
