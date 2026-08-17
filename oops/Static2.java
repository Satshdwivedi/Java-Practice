class Test {
    String name = "Ram";
    static int age = 38;

    void showName() {
        System.out.println(name);
    }

    static void showAge() {
        System.out.println(age);
    }
}
public class Static2{
    public static void main (String[]args){
        Test t1=new Test();
        Test.showAge();
        t1.showName();

    }  
}