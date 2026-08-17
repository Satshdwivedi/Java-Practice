public class invertedpyramid{
    public static void main(String[] args) {
        for(int i=5;i>=1;i--){
            for(int k=1;k<=5-i;k++)
        {
            System.out.print(" ");
        }
            for(int j=1;j<=2*i-1;j++)
            {
                System.err.print("*");
            
         }                                  
            System.out.println();
        

        }
    }
}