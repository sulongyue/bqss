package webserver.servlet;

import webserver.http.HttpRequest;
import webserver.http.HttpResponse;

import java.io.File;
import java.io.RandomAccessFile;

/**
 * @Description TODO
 * @Date 2023/2/15 16:34
 * @Created by 18355
 */
public class LoginServlet extends HttpServlet{

    public void service(HttpRequest request, HttpResponse response){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        try{
            RandomAccessFile raf
                    = new RandomAccessFile("user.dat","r");
            //开关，默认表示登录失败
            boolean check = false;
            for(int i=0;i<raf.length()/100;i++){
                //先将指针移动到该条记录用户名的位置
                raf.seek(i*100);
                byte[] data = new byte[32];
                raf.read(data);
                String name = new String(data).trim();
                if(name.equals(username)){
                    //找到此用户
                    raf.read(data);
                    String pwd = new String(data).trim();
                    if(pwd.equals(password)){
                        //登录成功
                        check = true;
                    }
                    break;
                }
            }//循环结束
            //基于check来判定是否登录成功
            //File file;
            if(check){
//                file = new File(
//                        "D:\\codeSource\\myself\\bqss\\webserver\\webapps/myweb/login_success.html");
                forward("myweb/login_success.html",request,response);
            }else{
//                file = new File(
//                        "D:\\codeSource\\myself\\bqss\\webserver\\webapps/myweb/login_fail.html");
                forward("myweb/login_fail.html",request,response);
            }
            //setResponse(file,response);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("LoginServlet:处理登录完毕");
    }
}
