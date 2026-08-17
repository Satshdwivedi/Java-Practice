class Calculator{
    
    public void add(int a,int b){
        System.out.println(a+b);
    }
    public void add(double a,double b){
        System.out.println(a+b);
    }
}
public class methloading2{
    public static void main(String[] args) {
        Calculator c1=new Calculator();
        c1.add(4,5);
         c1.add(48.79,57.28);
    }
}