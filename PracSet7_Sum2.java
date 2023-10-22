package CoreJava.PracSet7;

public class PracSet7_Sum2 {
    static void pattern(){
        for(int i=1;i<=5;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern();
    }
}
