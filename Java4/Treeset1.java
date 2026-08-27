import java.util.TreeSet;
import java.util.List;
import java.util.Comparator;
// yahan treeset se decending order me o/p le rahe hai
public class Treeset1{
    public static void main(String[] args) {
List<Integer> list1 = List.of(50,20,40,10,30);
        TreeSet<Integer> s = new TreeSet<>(Comparator.reverseOrder());
        s.addAll(list1);
        System.out.println(s);
        System.out.println(s.first());
        System.out.println(s.last());

    }
}
