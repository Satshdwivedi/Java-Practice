import java.util.List;
class Cards1{
    public void show(List<? extends Number>list){
        System.out.println(list);
    }
}
public class Wildcard1{
    public static void main(String[] args) {
        Cards1 c=new Cards1();
       c.show(List.of(10,0.03,30,40));
       c.show(List.of(104,2.001,2.3f));
    }
}