import java.util.function.Predicate;

public class Predicate1{
    public static void main(String[] args) {
        Predicate<Integer>p1=n-> n%2==0;
       System.out.println( p1.test(15));
       System.out.println(p1.test(20));
       Predicate<Integer>p2=n->n<16;
      Predicate<Integer> r= p1.and(p2);
      System.out.println(r.test(16));
      System.out.println(r.test(14));
      Predicate<Integer>R=p1.or(p2);
      System.out.println(R.test(16));
      System.out.println(R.test(14));
      Predicate<Integer>r1=p1.negate();
      System.out.println(r1.test(15));
       System.out.println(r1.test(20));
        }
    }
