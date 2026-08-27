import java.util.HashSet;
import java.util.List;
// hashset give no duplicate with no gurantee order
public class Hashset{
    public static void main(String[] args) {
List<Integer> nums = List.of(10, 20, 10, 30, 40, 20, 50, 30, 60);
        HashSet<Integer> s = new HashSet<>(nums);
          System.out.println(s.contains(40));
          s.remove(20);
          System.out.println(s);
    }
}

