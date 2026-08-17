class Animal1{
    private String name;
    public void setName(String name){
    this.name=name;
    }
    public String getName(){
        return name;
    }
    public void sound(){
        System.out.println("Animal sound");
    }
}
class Dog1 extends Animal1{
    public void sound(){
        System.out.println("Dog Barking");
    }
}
public class Rev{
    public static void main(String[] args) {
        Animal1 a1=new Animal1();
        Animal1 a2=new Dog1();
        Dog1 d1=new Dog1();
        a1.sound();
        a2.sound();
        d1.sound();
        a1.setName("dog");
        d1.setName("Tommy");
      System.out.println(a1.getName());
      System.out.println(d1.getName());


    }
}