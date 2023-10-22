package CoreJava;
class One {
    private int o = 10;
    protected int a=20;

    public void setO(int o) {
        o = o;
    }
    public int getO(){
        return o;
    }
}
class Two extends One{

}
public class AccessModifiers {

    public static void main(String[] args) {
        Two t=new Two();
        System.out.println(t.getO());
        System.out.println(t.a);
    }
}
