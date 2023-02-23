package exception;

/**
 * @Description TODO
 * @Date 2023/2/2 9:36
 * @Created by 18355
 */
public class MyException extends Exception{

    public MyException(){};

    public MyException(String msg){
        super(msg);
    }
}
