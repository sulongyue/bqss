package webserver.http;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description TODO
 * @Date 2023/2/15 10:24
 * @Created by 18355
 */
public class HttpRequest {
    public static final int CR = 13;
    public static final int LF = 10;

    private String method;

    private String url;

    private String protocol;

    private String requestURI;

    private String queryString;

    private Map<String,String> parameters = new HashMap<>();

    private Map<String,String> headers = new HashMap<>();

    private Socket socket;

    private InputStream in;

    public HttpRequest(Socket socket){
        this.socket = socket;
        try {
            in = socket.getInputStream();

            parseRequestLine();

            parseHeaders();

            parseContent();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 解析请求行
     */
    private void parseRequestLine(){
        String line = readLine();
        if ("".equals(line)) {
            throw new EmptyRequestException("这是一个空请求");
        }
        String[] data = line.split("\\s");
        this.method = data[0];
        this.url = data[1];
        this.protocol = data[2];
        parseUrl();
        System.err.println(parameters);
    }

    private void parseUrl(){
        if(url.indexOf("?")!=-1){
            //先按照"?"拆分
            String[] data = url.split("\\?");
            this.requestURI = data[0];
            if(data.length>1){
                this.queryString = data[1];
                //拆分每个参数
                data = queryString.split("&");
                for(String para : data){
                    //按照"="拆分参数
                    String[] paraArr = para.split("=");
                    if(paraArr.length>1){
                        this.parameters.put(paraArr[0], paraArr[1]);
                    }else{
                        this.parameters.put(paraArr[0], null);
                    }
                }
            }


        }else{
            this.requestURI = this.url;
        }
    }

    /**
     * 解析消息头
     */
    private void parseHeaders(){
        System.err.println("开始解析请求头");
        String line = "";
        while(!(line = readLine()).equals("")){
            String[] split = line.split(": ");
            headers.put(split[0],split[1]);
        }
    }

    private void parseContent(){

    }

    private String readLine(){
        StringBuilder builder = new StringBuilder();
        int c1 = -1;
        int c2 = -1;
        try {
            while((c2 = in.read()) != -1){
                if(c2 == LF && c1 == CR){
                    break;
                }
                builder.append((char)c2);
                c1 = c2;
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        return builder.toString().trim();
    }

    public String getMethod() {
        return method;
    }


    public String getUrl() {
        return url;
    }


    public String getProtocol() {
        return protocol;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public String getRequestURI() {
        return requestURI;
    }

    public String getQueryString() {
        return queryString;
    }

    public String getParameter(String key) {
        return parameters.get(key);
    }


}
