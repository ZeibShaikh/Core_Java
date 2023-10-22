package CoreJava;
class F{
    public void display1(){
        System.out.println("1");
    }
}
class G extends F{
    public void display2(){
        System.out.println("Child of base");
    }
}
class H extends F{
    public void display3(){
        System.out.println("Child of base");
    }
}
class I extends G{
    public void display4(){
        System.out.println("Child of G");
    }
}
class J extends H{
    public void display5(){
        System.out.println("Child of H");
    }
}
public class HierarchicalInheri {
    public static void main(String[] args) {
        J j=new J();
        I i=new I();
        i.display2();
        i.display4();;
        i.display1();
        j.display5();
        j.display3();
        j.display1();
    }
}
