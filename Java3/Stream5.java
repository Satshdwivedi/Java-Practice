import java.util.List;
public class Stream5{
    public static void main(String[] args) {
        List<Integer>list4=List.of(10, 20, 10, 30, 40, 20, 50, 30, 60);
List<Integer>result=list4.stream()
                         .skip(2)
                         .limit(3)
                          .toList();
System.out.println(result);
    }
}