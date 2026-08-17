class Animal{
    String name="Toomy";
    public void showName(){
        System.out.println("Name of Animal= "+name);
    }
}
class Dog extends Animal {
     public void showName(){
        System.out.println("Dog is Good");
     }
}
public class Revision{
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.showName();
    }
}
