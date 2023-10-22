package CoreJava.PracSet13;
class T8 extends Thread{
    public void run() {
        while (true) {
            System.out.println("Display");
        }
    }
}
class T9 extends Thread{
    public void run() {
        while (true) {
            System.out.println("No Display");
        }
    }
}
public class Sum3 {
    public static void main(String[] args) {
        T8 t=new T8();
        T9 t1=new T9();
        t.setPriority(10);
        t1.setPriority(2);
        System.out.println(t.getPriority());
        System.out.println(t1.getPriority());
//        t.start();
//        t1.start();
        System.out.println(t.getState());
        System.out.println(t.getId());
    }
}
