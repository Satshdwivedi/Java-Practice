import java.util.List;
public class Rev4{
    public static void main(String[] args) {
        List<Integer>num= List.of(10,15,20,10,25,30,15,40,50,20);
  int sum=  num.stream()
         .distinct()
         .filter(n->n%2==0)
         .map(n->n*n)
         .reduce(0,(a,b)->(a+b));
         System.out.println(sum);
         } 
        }
