import java.util.Queue;
import java.util.LinkedList;
//queue is first in first out
public class Queue1{
    public static void main(String[] args) {
        Queue<Integer>q=new LinkedList<>();
        q.add(20);
        q.add(10);
        q.add(30);
        q.add(50);
        q.add(40);
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.contains(50));
        System.out.println(q.size());
        System.out.println(q.remove());
        System.out.println(q);
    }
}