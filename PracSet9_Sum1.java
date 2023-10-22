package CoreJava.PracSet9;
class Cylinder{
    private int h;
    private int r;
    Cylinder(int hei,int rad){
        this.h=hei;
        this.r=rad;
    }
    public void setHeight(int height){
        h=height;

    }
    public int getHeight(){
        return h;
    }
    public void setRadius(int radius){
        r=radius;

    }
    public int getR(){
        return r;
    }

    public double surF(){
       return 2*3.14*r*h+2*3.14*r*r;

    }
    public double volume(){
        return 3.14*r*r*h;

    }
}

public class Sum1 {
    public static void main(String[] args) {
        Cylinder c=new Cylinder(10,20);
        c.setHeight(10);
        c.getHeight();
        c.setRadius(10);
        c.getR();
        System.out.println(c.surF());
        System.out.println(c.volume());
    }
}
