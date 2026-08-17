class Test1 {
    String name = "Ram";
    static int age = 38;
static {
        System.out.println("Static block");
    }
    void showName() {
        System.out.println(name);
    }

    static void showAge() {
        System.out.println(age);
    }
}
public class Static4 {
    public static void main (String[]args){
        Test1 t1=new Test1();
        Test1.showAge();
        t1.showName();

    }  
}