package CoreJava.PracSet6;

public class PracSet6_Sum8 {
    public static void main(String[] args) {
        int [] arr={1,22,3,4,5,6};
       boolean flag=false;
       for(int i=0;i< arr.length-1;i++){
           if(arr[i]>arr[i+1]){
               flag=true;
               break;
           }
       }
       if(flag==false){
           System.out.println("Array is sorted");
       }
       else{
           System.out.println("Array is not sorted");
       }
    }
}
