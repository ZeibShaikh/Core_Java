package CoreJava.PracSet15;

import java.util.Calendar;

public class PracSet15_Sum3 {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get( Calendar.SECOND));
    }
}
