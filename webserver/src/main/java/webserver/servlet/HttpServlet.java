package webserver.servlet;

import webserver.http.HttpRequest;
import webserver.http.HttpResponse;

import java.io.File;

/**
 * @Description TODO
 * @Date 2023/2/15 19:43
 * @Created by 18355
 */
public abstract class HttpServlet {

    public abstract void service(HttpRequest request, HttpResponse response);

    public void forward(String url,HttpRequest request,HttpResponse response){
        File file = new File("D:\\codeSource\\myself\\bqss\\webserver\\webapps/"+url);
        response.setEntity(file);
    }
}
