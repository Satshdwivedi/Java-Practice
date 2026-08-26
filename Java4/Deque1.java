import java.util.Deque;
import java.util.ArrayDeque;
public class Deque1{
 public static void main(String[] args) {
    Deque<Integer>dq= new ArrayDeque<>();
    dq.addFirst(20);
    dq.addLast(30);
    dq.addFirst(10);
    dq.addLast(40);
    System.out.println(dq);
    System.out.println(dq.remove(30));
    System.out.println(dq);
    System.out.println(dq.contains(40));
 }
}
