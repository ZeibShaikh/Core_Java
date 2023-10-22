package CoreJava;
class A{
    public void display(){
        System.out.println("One");
    }

}
class B extends A{
    public void display1() {
        System.out.println("Two");
    }
}
public class SingleInheri {
    public static void main(String[] args) {
        B b=new B();
        b.display();
        b.display1();
    }
}
