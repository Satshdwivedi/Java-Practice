class A2 implements Runnable {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("A= " + i);
        }
        
    }
}

    class B2 implements Runnable {
        public void run() {
            for (int i = 0; i <= 5; i++) {
                System.out.println("B= " + i);
            }
        }
    }


public class Threading {
    public static void main(String[] args) {
        A2 a = new A2();
        Thread t1=new Thread(a);
        B2 b = new B2();
        Thread t2=new Thread(b);
        t1.start();
        t2.start();

    }
}
