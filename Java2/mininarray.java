public class mininarray{
    public static void main(String[] args) {
        int[]arr={25,48,12,67,34};
        int min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
        if(arr[i]<min)  {
            min=arr[i];
        }
    }
    
  System.out.println(min);
}
        
    }
