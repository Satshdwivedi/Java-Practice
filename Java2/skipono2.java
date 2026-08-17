public class skipono2{
    public static void main(String[] args) {
        int []arr ={10,-5,20,-8,30,0,40,-2};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]<0)continue;
            if (arr[i]==0) break;
            sum=sum+arr[i];
         } 
           System.out.println("sum= "+sum);
    }
}

