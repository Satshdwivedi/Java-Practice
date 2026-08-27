import java.util.ArrayList;
import java.util.Iterator;
public class Iterator1{
    public static void main(String[] args) {
        ArrayList<String>z=new ArrayList<>();
        z.add("A");
        z.add("B");
        z.add("C");
        z.add("D");
  Iterator<String>y=z.iterator();
 while(y.hasNext())
 {//yahan per String a=y.next(); karne ke bad if(a.equals("C") bhi laga sakte the lekin humne direct kiya)
    if(y.next().equals("C"))
    { y.remove();}
}
    System.out.println(z);
 
    }
}
