package CoreJava.PracSet11;
abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class SmartTelephone extends Telephone{
    public void ring(){
        System.out.println("Ringing");
    }
    public void lift(){
        System.out.println("Lifting");
    }
    public void disconnect(){
        System.out.println("Disconnecting");
    }
}
public class Sum4 {
    public static void main(String[] args) {
        Telephone g=new SmartTelephone();
        g.disconnect();
        g.ring();
        g.lift();
    }
}

