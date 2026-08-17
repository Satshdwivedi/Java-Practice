class Animal2{
    final String a  ="Animal";
    final void eat(){
        System.out.println("Animal is eating");
    }}
class Dog2 extends Animal2{}

public class Final{
    public static void main(String[] args) {
        Dog2 d1=new Dog2();
        d1.eat();
        System.out.println(d1.a);

    }
}