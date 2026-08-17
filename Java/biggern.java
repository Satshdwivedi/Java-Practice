public class biggern {
    public static void main(String[] args) {

        int a = 25, b = 48, c = 32;

        if (a > b && a > c) {
            System.out.println(a + " is largest");
        }
        else if (b > a && b > c) {
            System.out.println(b + " is largest");
        }
        else {
            System.out.println(c + " is largest");
        }
    }
}