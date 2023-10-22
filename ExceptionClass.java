package CoreJava;
class AC extends Exception{
    public String getMessage(){
        return "This is getMessage";
    }
}
public class ExceptionClass{
    public static int divide(int a,int b)throws AC{
        if(b==0){
            throw new AC();
        }
        return a/b;

    }
    public static void main(String[] args) {
        try{
            divide(10,0);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
