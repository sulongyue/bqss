package webserver.core;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Description TODO
 * @Date 2023/2/15 10:01
 * @Created by 18355
 */
public class WebServer {

    private ServerSocket serverSocket;

    public WebServer(){
        try {
            this.serverSocket = new ServerSocket(8080);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void run(){
        try {
            ExecutorService executorService = Executors.newCachedThreadPool();
            System.err.println("等待客户端连接");
            while(true){
                Socket accept = serverSocket.accept();
                ClientHandler handler = new ClientHandler(accept);
                executorService.execute(handler);
//                Thread t = new Thread(handler);
//                t.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        WebServer webServer = new WebServer();
        webServer.run();
    }
}
