package CoreJava.PracSet4;

import java.util.Scanner;

public class PracSet4_Sum2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter subj1 marks");
        int inp1=sc.nextInt();
        System.out.println("Enter subj1 marks");
        int inp2=sc.nextInt();
        System.out.println("Enter subj1 marks");
        int inp3=sc.nextInt();
        int sum1=inp1+inp2+inp3/300;
        int perc1=sum1*100;
        if(perc1<40) {
            if (inp1 < 33 && inp2 < 33 && inp3 < 33) {
                System.out.println("You are failed");
            }
        }
        else{
            System.out.println("You have passed");
        }
    }
}
