package webserver.core;

import webserver.http.HttpRequest;
import webserver.http.HttpResponse;
import webserver.servlet.HttpServlet;
import webserver.servlet.LoginServlet;
import webserver.servlet.RegServlet;

import java.io.*;
import java.net.Socket;
import java.util.Objects;

/**
 * @Description TODO
 * @Date 2023/2/15 10:02
 * @Created by 18355
 */
public class ClientHandler implements Runnable{

    private Socket socket;

    public ClientHandler(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        try{
            //解析请求
            HttpRequest request = new HttpRequest(socket);

            //处理请求
            HttpResponse response = new HttpResponse(socket);
            String url = request.getRequestURI();
            System.err.println("url:"+url);
            String servletName = ServletContext.getServletByUrl(url);
            if(Objects.nonNull(servletName)){
                HttpServlet servlet = (HttpServlet) Class.forName(servletName).newInstance();
                servlet.service(request,response);
            }else{
                File file = new File("D:\\codeSource\\myself\\bqss\\webserver\\webapps" + url);
                if(file.exists()){
                    response.setStatusCode(200);
                    response.setEntity(file);
                }else{
                    response.setStatusCode(404);
                    response.setEntity(new File("D:\\codeSource\\myself\\bqss\\webserver\\webapps\\root\\404.html"));
                }
            }

            //发送响应
            response.flush();

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


}
