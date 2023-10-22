package CoreJava.PracSet6;

public class PracSet6_Sum3 {
    public static void main(String[] args) {
        int [] marks={10,20,30,40,50};
        int avg=0,sum=0;
        int len= marks.length;
        System.out.println(len);
        for(int i:marks){
            sum=sum+i;
            avg=sum/ len;
        }
        System.out.println(avg);
    }
}
