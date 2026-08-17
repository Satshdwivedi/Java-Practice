abstract class Animal{
public void eat(){
    System.out.println("Animal is eating");
} 
abstract void sound();
}
class Dog extends Animal{
    public void sound(){
        System.out.println("dog sound is bad");
    } 
} 
public class Abstraction{
    public static void main(String[]args){
        Dog d1=new Dog();
        d1.eat();
        d1.sound();
    }
}