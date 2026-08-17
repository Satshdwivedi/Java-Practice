abstract class Vehicle{
    abstract void start();
    public void stop(){
        System.out.println("Vehicle is stopping");
 }
}
class Car extends Vehicle{
  public void start(){
    System.out.println("Car is sarting");
  }  
}
public class Abstraction2{
  public static void main(String[] args) {
   Vehicle v1=new Car();
   v1.start();
   v1.stop();   
  }
}