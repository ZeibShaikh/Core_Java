package CoreJava.PracSet4;

import java.util.Scanner;

public class PracSet4_Sum6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name");
        String inp1=sc.nextLine();
        if(inp1.endsWith(".com")){
            System.out.println("This is a commercial website");
        }
        if(inp1.endsWith(".in")){
            System.out.println("It is a indian website");
        }
        if(inp1.endsWith(".org")){
            System.out.println("Its an organisational website");
        }
    }
}
