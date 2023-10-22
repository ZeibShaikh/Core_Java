package CoreJava;
interface W{
    void meth1();
    void meth2();
    default void meth3(){
        System.out.println("B");
    }
}
class X implements W{
    @Override
    public void meth2() {
        System.out.println("A");
    }

    @Override
    public void meth1() {
        System.out.println("B");
    }
}
public class InterfaceDefault {
    public static void main(String[] args) {

    }
}
