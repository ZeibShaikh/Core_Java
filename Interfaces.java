package CoreJava;
interface U{
    public void meth1();
    public void meth2();
}
class V implements U{
    @Override
    public void meth1() {
        System.out.println("This is meth1");
    }

    @Override
    public void meth2() {
        System.out.println("This is meth2");
    }
}
public class Interfaces {
    public static void main(String[] args) {
        V v=new V();
        v.meth1();
        v.meth2();
    }
}
