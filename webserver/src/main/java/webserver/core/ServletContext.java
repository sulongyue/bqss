package webserver.core;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description TODO
 * @Date 2023/2/15 19:47
 * @Created by 18355
 */
public class ServletContext {
    private static Map<String,String> servletMapping = new HashMap<>();

    static{
        initServletMapping();
    }

    private static void initServletMapping(){
        servletMapping.put("/myweb/reg","webserver.servlet.RegServlet");
        servletMapping.put("/myweb/login","webserver.servlet.LoginServlet");
    }

    public static String getServletByUrl(String url){
        return servletMapping.get(url);
    }
}
