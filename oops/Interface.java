interface Animal{
 void sound();
}
class Dog implements Animal{
    public void sound(){
        System.out.println("dog sound is bad");
    } 
} 
public class Interface{
    public static void main(String[]args){
        Dog d1=new Dog();
        Animal a1=new Dog();
        d1.sound();
        a1.sound();
    }
}