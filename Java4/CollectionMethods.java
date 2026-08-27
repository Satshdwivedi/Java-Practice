import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
public class CollectionMethods{
    public static void main(String[]args)
    {
   ArrayList<Integer>k=new ArrayList<>(List.of(10,20,30,20,40,20,50));
    Collections.reverse(k);
    System.out.println(k);
    Collections.shuffle(k);
    System.out.println(k);
    System.out.println(Collections.max(k));
    System.out.println(Collections.min(k));
    System.out.println(Collections.frequency(k,20));
    }
    
}