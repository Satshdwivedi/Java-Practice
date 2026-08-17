interface Animal1{
 void sound();
}
interface Pet extends Animal1{
 void play();
}
class Dog1 implements Pet{
    public void sound(){
        System.out.println("dog sound is bad");
    } 
    public void play(){
    System.out.println("Dog is playing");    
    }
}
public class Interface2{
    public static void main(String[]args){
        Dog1 d1=new Dog1();
        Pet p1=new Dog1();
        Animal1 a1=new Dog1();
        d1.sound();
        d1.play();
        p1.sound();
        a1.sound();
    }
}