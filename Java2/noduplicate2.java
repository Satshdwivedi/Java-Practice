public class noduplicate2
{
    public static void main(String[] args) 
    {
        int[] arr = {10, 20, 10, 30, 20, 10, 40};
        for(int i=0;i<arr.length;i++)
        {    int previous=0;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j])
                previous++;
            }
            if(previous==2)
            {
              System.out.println(arr[i]);
            }
            }
        }
        }