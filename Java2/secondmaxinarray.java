public class secondmaxinarray {
    public static void main(String[] args) {
        int[]arr={25,48,12,67,34};
        int max=arr[0];
        int second=arr[1];
        for(int i=0;i<arr.length;i++)
        {
        if(arr[i]>max)  {
            max=arr[i];
        }
    }for(int j=0;j<arr.length;j++){
        if(arr[j]<max && arr[j]>second){
            second=arr[j];
        }

    }
    
  System.out.println("second max= "+second);
}
        
    }
