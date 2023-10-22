package CoreJava;
class O{
    public void sum(int a,int b){
        System.out.println(a);
    }
}
class P extends O{
    public void sum(int a,int b){
        System.out.println(b);
    }
}
public class MethodOverridding {
    public static void main(String[] args) {
        P p=new P();
        p.sum(10,20);
    }
}
