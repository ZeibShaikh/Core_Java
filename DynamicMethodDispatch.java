package CoreJava;
class Q{
    public void on(){
        System.out.println("Turning on phone");
    }
}
class S extends Q{
    public void on(){
        System.out.println("Turning on smartphone");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
             Q q=new S();
             q.on();
    }
}
