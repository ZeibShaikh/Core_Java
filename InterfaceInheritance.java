package CoreJava;
interface Y{
    void meth1();
}
interface Z extends Y{
    void meth2();
}
class AA implements Z{
    @Override
    public void meth1() {
        System.out.println("A");
    }

    @Override
    public void meth2() {
        System.out.println("B");
    }
}
public class InterfaceInheritance {
    public static void main(String[] args) {
        AA a=new AA();
        a.meth1();
        a.meth2 ();
    }
}
