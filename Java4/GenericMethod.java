class Test{
    public<A,B,C> void show(A first,B second,C third){
        System.out.println(first+" "+second+" "+third);
    }
}
public class GenericMethod{
    public static void main(String[]args){
        Test t=new Test();
        t.show("Ram",35,25.5);
        t.show(30,39.12,"shyam");
    }
}