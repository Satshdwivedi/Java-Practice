public class array3 {
    public static void main(String[] args) {

        int[] arr1 = {10, 20, 30,20,40};
        int[] arr2 = {20,30, 20, 50,40};
        for(int i=0;i<arr1.length;i++){
            int previous=0;
            for(int j=0;j<i;j++){
               if( arr1[i]==arr1[j])
               previous++;}
               if (previous==0){
                for(int k=0;k<arr2.length;k++){
                    if(arr1[i]==arr2[k]){
                System.out.print(arr1[i]+" ");
                break;
            }
                    }
            }
        }                
               
            }
        }





































