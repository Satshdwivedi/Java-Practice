import java.util.List;
//wildcard se koi bhi data type le sakte hai uska nam dene ki jarurat nahi hai 
class Cards{
    public void show(List<?>list){
        System.out.println(list);
    }
}
public class Wildcard{
    public static void main(String[] args) {
        Cards c=new Cards();
       c.show(List.of(10,20,30,40));
       c.show(List.of("ram","shyam","mohan"));
    }
}