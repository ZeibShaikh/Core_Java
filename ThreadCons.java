package CoreJava;
class T5 extends Thread{
    T5(String name){
        System.out.println("My name is "+name);
    }
}
public class ThreadCons {
    public static void main(String[] args) {
        T5 t=new T5("Zeib");
//        t.sleep();
    }
}
