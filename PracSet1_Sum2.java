package CoreJava.PracSet1;

import java.util.Scanner;

public class PracSet1_Sum2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter subj1 marks");
        int inp1=sc.nextInt();
        System.out.println("Enter subj2 marks");
        int inp2=sc.nextInt();
        System.out.println("Enter subj3 marks");
        int inp3=sc.nextInt();
        int sum=inp1+inp2+inp3;
        int  cgpa=sum/3;
        System.out.println(cgpa);
    }
}
