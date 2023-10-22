package CoreJava.PracSet3;

public class PracSet3_Sum3 {
    public static void main(String[] args) {
        String template="Dear <|name|>, Thanks a lot!";
        String name="Zeib";
        template=template.replace("<|name|>",name);
        System.out.println(template);
    }
}
