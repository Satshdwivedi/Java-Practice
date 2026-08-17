abstract class Animal{
public void eat(){
    System.out.println("Animal is eating");
} 
abstract void sound();
}
class Dog extends Animal{
    public void sound(){
        System.out.println("Dog is barking");
    } 
} 
class Cat extends Animal{
 public void sound(){
    System.out.println("Cat is meowing");
 }
}
public class Abstraction1{
    public static void main(String[]args){
        Dog d1=new Dog();
        Cat c1=new Cat();
        Animal a1=new Dog();
        Animal a2=new Cat();
        d1.eat();
       d1.sound();
       c1.eat();
        c1.sound();
        a1.sound();
        a1.eat();
        a2.sound();
        a2.eat();
    }
}