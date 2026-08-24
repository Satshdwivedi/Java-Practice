@FunctionalInterface
interface Square{
    int mul(int a);
}
public class Lambda3{
    public static void main(String[] args) {
        Square c=a-> a*a; 
        
      System.out.println( c.mul(27));
        }
    }
