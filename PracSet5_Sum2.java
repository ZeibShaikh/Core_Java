package CoreJava.PracSet5;

public class PracSet5_Sum2 {
    public static void main(String[] args) {
        int n=5;
        int sum=0;
        for(int i=0;i<=n;i++){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
