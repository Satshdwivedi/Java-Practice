public class upto1000palindrome{
    public static void main(String[] args) {
        for (int i=1;i<=1000;i++)
        {
        int original=i;
        int num=i;
        int reverse=0;
        while(num>0){
            int digit=num%10;
            reverse=reverse*10+digit;
            num=num/10;
        if(original==reverse){
    
    System.out.print(i + " ");}
}
        }

    }
}