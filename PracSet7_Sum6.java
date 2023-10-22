package CoreJava.PracSet7;

public class PracSet7_Sum6 {
    static void avg(int ...arr){
        int sum=0,avg1=0;
        for(int i:arr){
            sum+=i;
            avg1=sum/ arr.length;
        }
        System.out.println(avg1);
    }
    public static void main(String[] args) {
        avg(1,2,3,4,5);
    }
}
