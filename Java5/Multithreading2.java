class A1 extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("A= " + i);
        }
        /*try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println(e);
        }*/
    }
}

    class B extends Thread {
        public void run() {
            for (int i = 0; i <= 5; i++) {
                System.out.println("B= " + i);
            }
        }
    }


public class Multithreading2 {
    public static void main(String[] args) {
        A1 a = new A1();
        B b = new B();
        a.start();
      try{  a.join();}
        catch(InterruptedException e){
            System.out.println(e);
        }

        b.start();
    }
}
