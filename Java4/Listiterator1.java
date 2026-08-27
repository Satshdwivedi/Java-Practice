import java.util.ArrayList;
import java.util.ListIterator;
public class Listiterator1{
    public static void main(String[] args) {
        ArrayList<String>z=new ArrayList<>();
        z.add("A");
        z.add("B");
        z.add("C");
        z.add("D");
  ListIterator<String>y=z.listIterator();
 while(y.hasNext())
 {  
    if(y.next().equals("C"))
    /*{ y.remove();//in dono statement ki jagah y.set("E"); likh sakte hai
    y.add("E");}//
    }*/
    {y.set("E");}}
    while(y.hasPrevious()){
        if(y.previous().equals("A"))
        {y.remove();
        y.add("F");}
    }
    System.out.println(z);
 
    }
}
