package CoreJava;

public class NestedTryCatch {
    public static void main(String[] args) {
        int[] arr={1,2};
        try {
//            int i = 10 / 0;
            System.out.println("Try");
            try{
                System.out.println(arr[10]);

            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
                System.out.println("Exception in level 2");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
