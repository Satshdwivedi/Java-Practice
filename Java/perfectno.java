public class perfectno{
    public static void main(String[] args) {
        int num=100;
        int original=num;
        int sum=0;
        for (int i=1;i<num;i++){
          if ( num%i==0)
          sum=sum +i;
        }
if (original==sum){
    System.out.println("No.is perfect No.");
}else{
    System.out.println("No. is not perfect No. ");
}
    }
}