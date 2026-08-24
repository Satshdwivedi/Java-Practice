@FunctionalInterface
interface Kaalapani{
    void show();
}
public class Lambda1{
    public static void main(String[] args) {
        // this is anonymous inner class 
       /*/ Kaalapani obj=new Kaalapani(){
           public void show(){
            System.out.println("It is in Andaman and Nicobar Island");
           } 
        };
        */
        // this is anonymous inner class and shorter version by lambda
        Kaalapani obj=()->{
            System.out.println("It is in Andaman and Nicobar Island");
        };
        obj.show();
    }
}
