class A extends Thread{
    public void run(){
        System.out.println(" Thread is running");
}
}
public class Multithreading1{
    public static void main(String[]args){
        A a=new A();
        a.start();
       // a.run();
    }
}
