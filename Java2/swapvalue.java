public class swapvalue{
    public static void main(String[] args) {
        int []arr={10,20,30,40,50};
        int a=0;
        for(int i=0;i<arr.length/2;i++){
             a=arr[i];
            arr[i]=arr[arr.length-1-i];
             arr[arr.length-1-i]=a;}
        for (int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
        

    }
}