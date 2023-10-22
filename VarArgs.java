package CoreJava;

public class VarArgs {
    static void sum(int ...arr){
        int sum1=0;
        for(int i:arr){
            sum1=sum1+i;
        }
        System.out.println(sum1);
    }
    public static void main(String[] args) {
        sum(10,20,30,40,50);
    }
}
