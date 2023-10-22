package CoreJava;

import java.util.ArrayList;

public class ArrayLIstDemo {
    public static void main(String[] args) {
        ArrayList<Integer> l1= new ArrayList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);
        l1.add(60);
        System.out.println(l1);
        l1.add(70);
        l1.size();
        l1.toArray();
        l1.clear();
        System.out.println(l1);

    }
}
