import java.util.HashMap;
//40000 se jyada walo ki key value print karo both map+lambda and map+lambda+stream api
public class Hashmap2{
    public static void main(String[]args){
    HashMap<Integer,Integer>b=new HashMap<>();
     b.put(101,50000);
     b.put(102,30000);
     b.put(103,70000);
     b.put(104,25000);
    /* * b.forEach((key,value)->{
        if(value>40000)
        {
            System.out.println(key+" "+value);
        } });*/
         //both give same result
    b.entrySet().stream()
    .filter(e->e.getValue()>40000)
    .forEach(e->System.out.println(e.getKey()+" "+e.getValue()));
     
    
 }
}