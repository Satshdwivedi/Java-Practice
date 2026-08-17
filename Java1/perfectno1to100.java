public class perfectno1to100{
    public static void main(String[] args) {
        
        for(int i=1;i<=100;i++)
        {   int sum=0;
            int original=i;
        for(int j=1;j<i;j++){
            if(i%j==0)
            sum=sum+j;
        }
        if(original==sum) 
         {  
     
     System.out.print(sum +" ");}
    }

    }
}