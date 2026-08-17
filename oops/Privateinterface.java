interface Vehicle5{
    void start ();
    private void message(){
        System.out.println("Private Method");
    }
    static void stop(){
        System.out.println("Vehicle is Stopped");
    }
    default void run(){
        message();
        System.out.println("Vehicle is Running");
    }
}
class Car5 implements Vehicle5{
    public void start(){
        System.out.println("Vehicle is Start");
    }
}
public class Privateinterface{
public static void main(String[] args) {
    Car5 c1=new Car5();
    c1.start();
    c1.run();
    Vehicle5.stop();
}
}