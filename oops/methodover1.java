class Vehicle{
    public void start(){
        System.out.println("Vehicle is starting");
    }
}
class Car extends Vehicle{
    public void start(){
        System.out.println("Car is starting");
    }
}
public class methodover1{
    public static void main(String[] args) {
        Vehicle v1=new Vehicle();
        Car c1=new Car();
        v1.start();
        c1.start();
    }
}