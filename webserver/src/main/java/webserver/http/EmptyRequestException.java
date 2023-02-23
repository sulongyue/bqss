package webserver.http;

/**
 * @Description TODO
 * @Date 2023/2/15 15:58
 * @Created by 18355
 */
public class EmptyRequestException extends RuntimeException{

    public EmptyRequestException(){

    }

    public EmptyRequestException(String msg){
        super(msg);
    }
}
