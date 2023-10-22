package CoreJava.PracSet2;

import java.util.Scanner;

public class PracSet2_Sum3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int inp1=sc.nextInt();
        int num=10;
        if(num>inp1){
            System.out.println("Entered number is smaller");
        }
        else{
            System.out.println("Entered Number is greater");
        }
    }
}