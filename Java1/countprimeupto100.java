public class countprimeupto100{
    public static void main(String[] args) {
        int count1=0;
        for(int i=1;i<=100;i++){
            int count=0;
            int num=i;
              for(int j=1;j<=num;j++){
                if(num%j==0){
                     count++;}
                }
                if (count==2){
                     count1++;
                }
                }
                System.out.println("Total no. of prime no.= "+count1);
            }
        
    }
