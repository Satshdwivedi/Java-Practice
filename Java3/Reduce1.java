import java.util.List;
public class Reduce1{
    public static void main(String[] args) {
        List<Integer>list2=List.of(13,18,17,29,32,48,16,34,27);
             int mul= list2.stream()
                  .reduce(1,(a,b)->(a*b));
        System.out.println("Multiplication of each element of list= "+mul);
                  
    }
}
