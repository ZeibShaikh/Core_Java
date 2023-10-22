package CoreJava;
class K{
    public K(){
        System.out.println("Base");
    }
}
class L extends K{
    public L(){
        System.out.println("Derived");
    }
}
public class ConstInheri {
    public static void main(String[] args) {
        L l=new L();
    }
}
