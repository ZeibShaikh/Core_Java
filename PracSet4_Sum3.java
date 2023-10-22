package CoreJava.PracSet4;

import java.util.Scanner;

public class PracSet4_Sum3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Tax amount that you pay");
        float inp1=sc.nextInt();
        if(inp1<2.5){
            System.out.println("Wrong input");
        }
        if(inp1>=2.5&&inp1<5.0){
            System.out.println("5%");
        }
        else if(inp1>=5.0&&inp1<10.0){
            System.out.println("20%");
        } else if(inp1>=10.0){
            System.out.println("30%");
        }
    }
}
