package CoreJava.PracSet11;
interface TvRemote{
    void run();
}
interface SmartTvRemote extends TvRemote{
    void googleAssistant();
}
class AB implements SmartTvRemote{
    public void run(){
        System.out.println("Simple remote");
    }
    public void googleAssistant(){
        System.out.println("Smart remote");
    }
}
public class Sum6 {
    public static void main(String[] args) {
        AB ab=new AB();
        ab.googleAssistant();
        ab.run();
    }
}
