package exception;

/**
 * @Description TODO
 * @Date 2023/2/2 9:38
 * @Created by 18355
 */
public class MyExceptionTest {
    public static void main(String[] args) {
        try{
            throw new MyException("my exception zz");
        }catch (Exception e){
            System.err.println(e.getMessage());
            e.printStackTrace();
            //StackTraceElement[] stackTrace = e.getStackTrace();
        }
    }
}
