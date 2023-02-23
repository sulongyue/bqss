package webserver.http;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Description TODO
 * @Date 2023/2/15 11:51
 * @Created by 18355
 */
public class HttpResponse {

    private int statusCode = 200;

    private Map<String,String> headers = new HashMap<>();

    private File entity;

    private Socket socket;

    private OutputStream out;

    public HttpResponse(Socket socket){
        try{
            this.socket = socket;
            this.out = socket.getOutputStream();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void flush(){
        sendStatusLine();
        sendHeaders();
        sendContent();
    }

    private void sendStatusLine(){
        try{
            //发送状态行
            String line = HttpContext.HTTP_VERSION+" "+statusCode+" "+HttpContext.getStatus(statusCode);
            out.write(line.getBytes("ISO8859-1"));
            out.write(13);//written CR
            out.write(10);//written LF
        }catch (Exception e){

        }
    }

    private void sendHeaders(){
        try {
            Set<Map.Entry<String, String>> entries = headers.entrySet();
            for(Map.Entry<String,String> entry : entries){
                String line = entry.getKey()+": "+entry.getValue();
                out.write(line.getBytes("ISO8859-1"));
                out.write(13);//written CR
                out.write(10);//written LF
            }
            out.write(13);//written CR
            out.write(10);//written LF
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void sendContent(){
        try{
            FileInputStream fis
                    = new FileInputStream(entity);
            //发送响应正文
            int len = -1;
            byte[] data = new byte[1024*10];
            while((len = fis.read(data))!=-1){
                out.write(data, 0, len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setEntity(File entity) {
        this.entity = entity;
        headers.put("Content-Type","text/html");
        headers.put("Content-Length",String.valueOf(entity.length()));
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public void putHeaders(String key,String value) {
        this.headers.put(key,value);
    }
}
