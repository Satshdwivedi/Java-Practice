abstract class Animal2{
    final String a="Aniaml";
    abstract void sound();
}
interface Runner{
    void run();
}
class Dog2 extends Animal2 implements Runner{
    public void sound(){
        System.out.println("Dog is Barking");
    }

    public  void run(){
        System.out.println("Dog is Running");
    }
    static void method(){
        System.out.println("Program Started");
    }
}
public class Rev1{
    public static void main(String[] args) {
        Dog2 d1=new Dog2();
        Animal2 a1=new Dog2();
        d1.sound();
        d1.run();
        Dog2.method();
        a1.sound();
        System.out.println(d1.a);
        System.out.println(a1.a);
    }
}