package CoreJava.PracSet13;
class T6 extends Thread{
    public void run() {
        int i=0;
        while (i<1000) {
            System.out.println("good morning");
            i++;
        }
    }
}
class T7 extends Thread{
    public void run() {
        int i=0;
        while (i<100) {
        try{
            Thread.sleep(200);
            System.out.println("Welcome");

        }
        catch(Exception e){
            System.out.println(e);
        }
            i++;
    }
}
}
public class Sum1 {
    public static void main(String[] arkgs) {
        T6 t=new T6();
        T7 t1=new T7();
        t.start();

        t1.start();

    }
}
