package CoreJava.PracSet11;
class Monkey{
    public void jump(){
        System.out.println("Jumping");
    }
    public void bite(){
        System.out.println("Biting");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("Eating");
    }
    public void sleep(){
        System.out.println("Sleeping");
    }
}
public class Sum3 {
    public static void main(String[] args) {
        Human h=new Human();
        h.eat();
        h.sleep();
        h.bite();
        h.jump();
        Monkey m=new Human();
        m.bite();
        m.jump();
    }
}
