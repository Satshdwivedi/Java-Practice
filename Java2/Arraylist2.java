import java.util.ArrayList;
public class Arraylist2{
    public static void main (String[]args){
        ArrayList<Integer>num=new ArrayList<>();
               num.add(10);
num.add(20);
num.add(30);
num.add(40);
num.add(50);
num.set(2,300);
num.remove(1);
System.out.println(num.get(3));
System.out.println(num.size());
System.out.println("Num= "+num);
for(int i=0;i<num.size();i++){
    System.out.println(num.get(i));
}
    }
}