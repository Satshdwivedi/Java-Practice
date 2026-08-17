public class skipono{
    public static void main(String[] args) {
        int []arr ={10,-5,20,-8,30,-2,40};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                sum=sum+arr[i];
            }
                else continue;
        }System.out.println("sum= "+sum);
    }
} 