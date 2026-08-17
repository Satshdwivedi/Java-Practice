interface Vehicle3{
    void start();
    default void stop(){
        System.out.println("Vehicle is Stopped");
    }
}
class Car3 implements Vehicle3{
    public void start(){
        System.out.println("Vehicle is Start");
    }
}
public class Defaultinterface{
   public static void main(String[] args) {
    Car3 c1=new Car3();
    c1.start();
    c1.stop();
   } 
}