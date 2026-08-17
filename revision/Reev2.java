class Animal3{
    public void sound(){
        System.out.println("Animal sound");
    }
}
class Dog3 extends Animal3{
    public void sound (){
        System.out.println("Bark");
    }
}
public class Reev2{
    public static void main(String[] args) {
        Animal3 a1=new Dog3();
        try{
            a1.sound();
           int a=10;
           int b=0;
           System.out.println(a/b); 
        }
        catch(ArithmeticException e){
            System.out.println("Can not divide by Zero");
        }
        finally {
          System.out.println("Program Finished");
        }
    }
}