package CoreJava;
class C{
    public void display1(){
        System.out.println("Base");
    }
}
class D extends C{
    public void display2(){
        System.out.println("Child");
    }
}
class E extends D{
    public void display3(){
        System.out.println("Child of Child");
    }
}
public class MultiLevel {
    public static void main(String[] args) {
        E e=new E();
        e.display1();
        e.display2();
        e.display3();
    }
}
