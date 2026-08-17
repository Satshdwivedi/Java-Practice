public class booleanprime{
    public static void main(String[] args) {
        int num= 25;
        int count=0;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            count++;}
            if (count==2)System.out.println("no.is prime no.");
            else System.out.println("no is not prime no.");
    }
} 