class Test1{
    public<A extends Number ,B,C extends Object> void show(A first,B second,C third){
        System.out.println(first+" "+second+" "+third);
    }
}
public class GenericMethod2{
    public static void main(String[]args){
        Test1 t=new Test1();
        t.show(89.43f,"Ram",25.5);
        t.show(30,39.12,"shyam");
    }
}