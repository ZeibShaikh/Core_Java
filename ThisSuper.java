package CoreJava;
class M{
    int a=10;
    int b=20;
    public M(){
        System.out.println(this.a);
        System.out.println(this.b);
    }
    public M(int c,int d){
        System.out.println(c);
    }
}
class N extends M{
    public N(int a,int b){
        super(a, b);
    }
}
public class ThisSuper {
    public static void main(String[] args) {
        M m=new M();
        N n=new N(10,20);
    }
}
