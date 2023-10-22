package CoreJava;
abstract class R{
    public void meth1(){
        System.out.println("This is meth one");
    }
    abstract void meth2();
}
class T extends R{
    public void meth2(){
        System.out.println("This is meth two");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
//        R r=new R();
        T t=new T();
        t.meth2();
        t.meth1();
    }
}
