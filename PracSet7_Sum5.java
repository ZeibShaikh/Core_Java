package CoreJava.PracSet7;

public class PracSet7_Sum5 {
    static int fibo(int n){
        if(n<=1)
            return 1;
        else
            return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
        int n=10;
        for(int i=0;i<n;i++){
            System.out.print(fibo(i)+" ");
        }
    }
}
