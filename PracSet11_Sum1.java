package CoreJava.PracSet11;
abstract class Pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen{
    public void changeNib(){
        System.out.println("Changing nib");
    }
    public void write(){
        System.out.println("Writing");
    }
    public void refill(){
        System.out.println("Pen is refilled");
    }
}
public class Sum1 {
    public static void main(String[] args) {

    }
}
