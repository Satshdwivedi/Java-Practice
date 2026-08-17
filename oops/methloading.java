class Calculator{
    
    public void add(int a,int b){
        System.out.println(a+b);
    }
    public void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
}
public class methloading{
    public static void main(String[] args) {
        Calculator c1=new Calculator();
        c1.add(4,5);
         c1.add(78,89,54);
    }
}