package CoreJava;
class T1 extends Thread{

    public void run() {

        int i=0;
        while (i<1000) {
            System.out.println("This is thread 1");
            i++;
        }
    }
}
class T2 extends Thread{
    public void run() {
        int i=0;
        while (i<1000) {
            try {
                System.out.println("This is thread 2");
                sleep(500);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }
    }
}
public class Threading {
    public static void main(String[] args) throws InterruptedException {
        T1 t = new T1();
        T2 t2 = new T2();
        t.start();
        t.join();
        t2.start();
    }
}
