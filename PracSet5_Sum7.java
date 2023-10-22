package CoreJava.PracSet5;

public class PracSet5_Sum7 {
    public static void main(String[] args) {
        int num=2,sum=0,mul;
        for(int i=0;i<=10;i++){
            mul=i*num;
//            System.out.println(mul);
            sum=sum+mul;
        }
        System.out.println(sum);
    }
}
