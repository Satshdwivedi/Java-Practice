@FunctionalInterface
interface Addition{
    void add(int a,int b);
}
public class Lambda2{
    public static void main(String[] args) {
        Addition c=(a,b)->{
            System.out.println(a+b);
        };
        c.add(4,5);
        }
    }
