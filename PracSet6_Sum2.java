package CoreJava.PracSet6;

public class PracSet6_Sum2 {
    public static void main(String[] args) {
        int [] arr1={1,2,3,4,5};
        int key=7;
        boolean flag=false;
        for(int i=0;i< arr1.length;i++){
            if(key==arr1[i]){
                System.out.println("Element is present in the array at index "+i);
                flag=true;
            }
        }
        if (flag == false) {
            System.out.println("Element is not present in the array");
        }
    }
}
