package CoreJava;

public class BreakContinue {
    public static void main(String[] args) {
        int n=10;
        for(int i=0;i<10;i++){

            if(i==5){
                continue;
            }
            if(i==7){
                break;
            }
            System.out.println(i);
        }
    }
}
