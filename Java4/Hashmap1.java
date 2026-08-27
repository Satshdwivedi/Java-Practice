import java.util.HashMap;
//import java.util.Map; isko both only map and map + lambda dono se ker sakte hai 
public class Hashmap1{
    public static void main(String[]args){
    HashMap<Integer,String>b=new HashMap<>();
     b.put(101,"Pralay");
     b.put(102,"Vinash");
     b.put(103,"jaljala");
    /* * for(Map.Entry<Integer,String>e:b.entrySet()){
        System.out.println(e.getKey()+" "+e.getValue());
     }*/
    b.forEach((key,value)->System.out.println(key+" "+value)); 
    
    
    for(Integer k:b.keySet()){
        System.out.print(k+" ");
    }
    for(String v:b.values()){
        System.out.print("\n"+v+" ");
    }
 }
}