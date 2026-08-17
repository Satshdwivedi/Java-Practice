public class palindrome{
    public static void main(String[] args) {
        int num=123;
        int original=num;
        int reverse=0;
        while(num>0){
            int digit=num%10;
            reverse=reverse*10+digit;
            num=num/10;
        }
        if(original==reverse)
        {
        System.out.print("No. is Palimdrome");
        }else
        {System.out.println("No. is not palindtome");
        }
    }
}