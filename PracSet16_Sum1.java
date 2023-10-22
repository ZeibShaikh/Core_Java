package CoreJava.PracSet16;
class AF{
    @Deprecated
    public void add(){
        System.out.println();
    }
}
public class PracSet16_Sum1 {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        AF a=new AF();
        a.add();
    }
}
