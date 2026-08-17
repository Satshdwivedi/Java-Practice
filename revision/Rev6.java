abstract class Payment{
final String currency="INR";
abstract void pay();
}
interface Refund{
    void refund();
}
class UPIPayment extends Payment implements Refund{
    public void pay(){
        System.out.println("Phonepay");
    }
    public void refund(){
        System.out.println("Cash only");
    }
}
public class Rev6{
    public static void main(String[] args) {
        Payment p1=new UPIPayment();
        p1.pay();
        System.out.println(p1.currency);
        UPIPayment u1=new UPIPayment();
        u1.refund();
    }
}