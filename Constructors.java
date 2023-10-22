package CoreJava;
class Three{
    Three(){
        System.out.println("Constructor of Class One");
    }
    Three(int a){
        System.out.println(a);
    }
}
class Four extends Three{
    Four(){
        System.out.println("Constructor of Class Two");
    }
}
public class Constructors {
    public static void main(String[] args) {
        Three t=new Three(10);
        Four f=new Four();

    }
}