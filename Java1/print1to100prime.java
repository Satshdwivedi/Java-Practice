public class print1to100prime{
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            int count=0;
            int num=i;
              for(int j=1;j<=num;j++){
                if(num%j==0){
                     count++;}
                }
                if (count==2){
                    System.out.print(i+" ");
                }
                }
            }
        }
                
            