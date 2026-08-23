import java.util.ArrayList;
import java.util.Iterator;
public class Collection3{
    public static void main(String[] args) {
        ArrayList<Integer>num=new ArrayList<>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);
        Iterator<Integer>it=num.iterator();
        while(it.hasNext()){
            if(it.next()==30){
                it.remove();}
        }
       System.out.println(num);
    }
}