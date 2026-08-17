class car{
    String name;
    String colour;
    int speed;
        public void showDetails()
    {
      System.out.println("Name of car is  "+name);
      System.out.println("Colour of car is "+colour);
      System.out.println("Speed of car in km/h="+speed);
    }
}
public class demo1{
    public static void main(String[]args){
        car c1=new car();
        
        c1.name="Creta";
        c1.colour="Black";
        c1.speed=100;
        car c2=new car();
        c2.name="Scporpio";
        c2.colour="White";
        c2.speed=80;
        c1.showDetails();
        c2.showDetails();
 }
}