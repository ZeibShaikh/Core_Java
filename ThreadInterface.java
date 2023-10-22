package CoreJava;
class T3 implements Runnable{
    public void run(){
        System.out.println("Thead 1");
    }

}
class T4 implements Runnable{
    public void run(){
        System.out.println("Thread 2");
    }
}
public class ThreadInterface {
    public static void main(String[] args) {
        T3 t=new T3();
        T4 t1=new T4();
        Thread tt1=new Thread(t);
        Thread tt2=new Thread(t1);
        tt1.start();
        tt2.start();
    }
}
