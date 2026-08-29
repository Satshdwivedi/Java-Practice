public class Threading1 {// mutithreading2 ka shorter version runnable+lambda
    public static void main(String[] args) {
        Runnable r1=()->{for(int i=0;i<=5;i++){System.out.println("A= "+i);}};
        Thread t1=new Thread(r1);
         t1.start();
       Runnable r2=()->{for(int i=0;i<=5;i++){System.out.println("B= "+i);}};
        Thread t2=new Thread(r2);
         t2.start();

    }
}
