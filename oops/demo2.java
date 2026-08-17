class fan{
    String brand;
    int speed;
    public void showDetails()
    {
      System.out.println("Brand name is  "+brand);
      System.out.println("Speed of fan in rpm="+speed);
    }
    public void start(){
        System.out.println("fan is running");
    }
}
public class demo2{
    public static void main(String[]args){
        fan f1=new fan();
        fan f2=new fan();
        f1.brand="USHA";
        f1.speed=75;
        f2.brand="CROMPTON";
        f2.speed=80;
        f1.showDetails();
        f1.start();
        f2.start();
        f2.showDetails();
 }
}