package CoreJava.PracSet6;

public class PracSet6_Sum1 {
    public static void main(String[] args) {
        float [] arr={1.0f,2.0f,3.0f,4.0f,5.0f};
        float sum=0;
        for(int i=0;i< arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
