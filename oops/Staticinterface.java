interface Vehicle4{
    static void info(){
      System.out.println("This is a Vehicle");
    }
}
class Car4 implements Vehicle4{}
public class Staticinterface{
    public static void main (String[]args){
        Vehicle4.info();
        
    }
}