public class primeno13 {
    public static void main(String[] args) {
        int num = 13;
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count = count + 1;
            }
        }

        if (count == 2) {
            System.out.println("13 is prime no.");
        } else {
            System.out.println("13 si not prime no.");

        }

    }
}