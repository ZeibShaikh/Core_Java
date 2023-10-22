package CoreJava;

public class MethodOverloading {
    static void sum(int a,int b){
        int sum1=a+b;
        System.out.println(sum1);
    }
    static void sum(int a,int b,int c){
        int sum1=a+b+c;
        System.out.println(sum1);
    }
    static void sum(int a,int b,int c,int d){
        int sum1=a+b+c+d;
        System.out.println(sum1);
    }
    public static void main(String[] args) {
        sum(1,2);
        sum(1,2,3);
        sum(1,2,3,4);
    }
}
