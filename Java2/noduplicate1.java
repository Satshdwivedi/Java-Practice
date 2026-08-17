public class noduplicate1
{
    public static void main(String[] args) 
    {
        int[] arr = {10, 20, 30, 20, 40, 10, 50};
        for(int i=0;i<arr.length;i++)
        {    int previous=0;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j])
                previous++;
            }
            if(previous==1)
            {
              System.out.println(arr[i]);
            }
            }
        }
        }
    

    