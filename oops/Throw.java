public class Throw{
    public static void main(String[] args) {
        int age=17;
       try{
         if(age<18){
            throw new ArithmeticException("Not Eligible");
    }}
    catch(ArithmeticException e){
        System.out.println("Error Occurred");
        System.out.println(e.getMessage());
    }
}
}