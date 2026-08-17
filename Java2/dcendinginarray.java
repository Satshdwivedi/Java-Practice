public class dcendinginarray{
    public static void main(String[] args) {
        int[] arr={25,67,48,67,34};
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
           for(int i=1;i<arr.length;i++)
           { if (arr[i]!=arr[0]){
            System.out.println(arr[i]+" is the second largest ");
            break;
           }
    
                }
    }
    
    }
  

    
