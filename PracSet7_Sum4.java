package CoreJava.PracSet7;

public class PracSet7_Sum4 {
    static void pattern(){
        for(int i=5;i>=1;i--){
            for(int j=1;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern();
    }
}
