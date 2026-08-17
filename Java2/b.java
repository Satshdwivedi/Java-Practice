public class b{

    public static void main(String[] args) {
        int[] arr={67,48,32,25,12};
        int a=0;
        for(int i=0;i<arr.length;i++)
        { 
            for(int j=i+1;j<arr.length;j++)
            { 
                if (arr[i]<arr[j])
                {
                a=arr[i];
                arr[i]=arr[j];
                arr[j]=a;
            }
            }
        }
           //for(int i=0;i<arr.length;i++)
           System.out.print(arr[1]+ " is the second largest no. "); 
        
        }

    }
