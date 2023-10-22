package CoreJava.PracSet10;
class Circle{
    int radius;
    int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void print(){
        System.out.println("Circle");
    }
    public double area(){
        double ar=3.14*radius*radius;
        return ar;
    }
}
class Cylider1 extends Circle{
    public void print1(){
        System.out.println("Cylinder");
    }
    public double volume(){
        return 3.14*radius*radius*height;
    }
}
public class Sum1 {
    public static void main(String[] args) {
        Cylider1 c=new Cylider1();
        c.print1();
        c.setRadius(10);
        c.getRadius();
        c.setHeight(10);
        c.getHeight();
        System.out.println(c.area());
        System.out.println(c.volume());
    }
}
