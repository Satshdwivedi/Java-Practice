public class factorialofeachdigit{
    public static void main(String[] args) {
        int num=123;
        while(num>0){
            int digit =num%10;
            int fact=1;
            for(int i=1;i<=digit;i++){
                fact=fact*i;}
                System.out.print(fact+" ");
                num=num/10;

            }
        }
    }
