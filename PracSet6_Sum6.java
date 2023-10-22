package CoreJava.PracSet6;

public class PracSet6_Sum6 {
    public static void main(String[] args) {
        int [] arr={1,2,13,4,5};
        int max=arr[0];
        for(int i=0;i< arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }

        }
        System.out.println(max);
    }
}
