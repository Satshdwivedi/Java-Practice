interface Bank{
    void deposit();
default void welcome(){
    System.out.println("WELCOME");
}
static void rules(){
    System.out.println("RULES");
}
}
class SBI implements Bank{
    public void deposit(){
        System.out.println("DEPOSIT");
    }
}
public class Rev7{
public static void main(String[] args) {
    SBI s1=new SBI();
    s1.deposit();
    s1.welcome();
    Bank.rules();
    try{
        int a=20;
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
    
