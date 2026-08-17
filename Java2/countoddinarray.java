public class countoddinarray{
    public static void main(String[] args) {
        int[]arr={10,25,32,47,50,63,74};
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
        if(arr[i]%2!=0)  {
            count++;
            
        }
    }System.out.println("total = "+count);
    
  
}
        
    }