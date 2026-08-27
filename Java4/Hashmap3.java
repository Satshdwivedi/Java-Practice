import java.util.HashMap;
//60 se jyada marks wale students ki key and value print karna 
public class Hashmap3{
    public static void main(String[] args) {
HashMap<Integer, Integer> marks = new HashMap<>();
marks.put(101, 75);
marks.put(102, 45);
marks.put(103, 90);
marks.put(104, 55);
marks.put(105, 30);
   marks.entrySet().stream()
   .filter(m->m.getValue()>60)
   .forEach(m->System.out.println(m.getKey()+" "+m.getValue()));

}
}
