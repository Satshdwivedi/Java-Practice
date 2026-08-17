public class trycatch {
    public static void main(String[] args) {
        try {
            int a = 20;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("can not divide by zero");
            //System.out.println(e);
        }
    }
}