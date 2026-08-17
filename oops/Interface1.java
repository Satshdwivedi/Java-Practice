interface Animal1{
 void sound();
}
interface Pet{
 void play();
}
class Dog1 implements Animal1,Pet{
    public void sound(){
        System.out.println("dog sound is bad");
    } 
    public void play(){
    System.out.println("Dog is playing");    
    }
} 
public class Interface1{
    public static void main(String[]args){
        Dog1 d1=new Dog1();
        Pet p1=new Dog1();
        Animal1 a1=new Dog1();
        d1.sound();
        d1.play();
        p1.play();
        a1.sound();
    }
}