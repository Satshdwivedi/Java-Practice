public class armstrongno1to1000{
    public static void main(String[] args) {
       for(int i=1;i<=1000;i++)
       {
        int num=i;
        int sum=0;
        int original=i;
        while(num>0)
        {
            int digit=num%10;
            sum=sum+digit*digit*digit;
            num=num/10;
        }
        if (original==sum)
        {
            System.out.print(original+ " ");
        
        }
       
    }

}
}
