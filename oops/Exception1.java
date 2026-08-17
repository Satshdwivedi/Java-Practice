public class Exception1{
    public static void main(String[] args) {
        int[]arr={10,20,30};
        try{
            System.out.println(arr[5]);
    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Array index Error");
    }
    catch(Exception e){
        System.out.println(e);
    }
    finally{
        System.out.println("Program Finished");
    }
}
}