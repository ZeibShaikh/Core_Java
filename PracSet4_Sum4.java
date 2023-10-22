package CoreJava.PracSet4;

import java.util.Scanner;

public class PracSet4_Sum4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year");
        int inp1= sc.nextInt();
        if(inp1%4==0){
            System.out.println("Its a leap year");
        }
        else if(inp1%400==0){
            System.out.println("Its a leap year");
        }
        else{
            System.out.println("Its not a leap year");
        }
    }
}
