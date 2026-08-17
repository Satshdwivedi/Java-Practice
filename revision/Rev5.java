interface Machine{
    void start();
    default void stop(){
        System.out.println("Machine Stopped");
    }
}
class Robot implements Machine{
    public void start(){
        System.out.println("Machine Started");
    }
    final String type="Robot";
    static void info(){
        System.out.println("Mixer");
    }
}
public class Rev5{
    public static void main(String[] args) {
     Robot r1=new Robot();
     r1.start();
     r1.stop();
     System.out.println(r1.type);
     Robot.info();
       try{
        int a=10;
        int b=0;
        System.out.println(a/b);
       } 
       catch(ArithmeticException e){
        System.out.println("Can not divide by Zero");
       }
       finally{
        System.out.println("Program Finished");
       }
    }
}