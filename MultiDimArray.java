package CoreJava;

public class MultiDimArray {
    public static void main(String[] args) {
        int [][] arr={{1,2,3,4},{4,5,6,7}};
        int [][] arr1={{1,2,3,4},{4,5,6,7}};
        int [][] result={{0,0,0,0},{0,0,0,0}};
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                result[i][j]=arr[i][j]*arr1[i][j];
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
        int [] arr3={1,2,3,4};
        int [] arr4={1,2,3,4};
        int [] result1={0,0,0,0};
        for(int i=0;i<arr3.length;i++){
//            for(int j=0;j<arr3[i].length;j++){
                result1[i]=arr3[i]+arr4[i];
            System.out.print(result1[i]+" ");
        }
        System.out.println();
    }
}
