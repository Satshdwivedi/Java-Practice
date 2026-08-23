  import java.util.Set;
  import java.util.HashSet;
   public class Collection1 {
    public static void main(String[]args){
   Set<Integer>num=new HashSet<>();
   num.add(10);
   num.add(20);
   num.add(30);
   num.add(10);
   System.out.println(num);
   System.out.println(num.contains(10));
    }
}
