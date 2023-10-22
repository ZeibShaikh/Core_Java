package CoreJava.PracSet15;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PracSet15_Sum4 {
    public static void main(String[] args) {
        LocalDateTime d=LocalDateTime.now();
        DateTimeFormatter df=DateTimeFormatter.ofPattern("HH:mm:ss");
        String s=d.format(df);
        System.out.println(s);
    }
}
