import java.util.ArrayList;
public class Rev5{
    public static void main(String[] args) {
    ArrayList<Integer>sum=new ArrayList<>();
    sum.add(10);
    sum.add(20);
    sum.add(0);
    sum.add(40);
    sum.add(50);
for(Integer n: sum){
    try{
        System.out.println(100/n);
    }
    catch(ArithmeticException e){
        System.out.println("Can not divide by zero");
    }
}

    }
}