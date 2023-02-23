package webserver.http;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description TODO
 * @Date 2023/2/15 15:38
 * @Created by 18355
 */
public class HttpContext {
    public static final String HTTP_VERSION = "HTTP/1.1";
    private static Map<Integer,String> statusReasonMapping = new HashMap<>();
    private static Map<String,String> mimeMapping = new HashMap<>();

    static{
        initStatusMapping();
        initMimeMapping();
    }

    private static void initStatusMapping(){
        statusReasonMapping.put(200, "OK");
        statusReasonMapping.put(201, "Created");
        statusReasonMapping.put(202, "Accepted");
        statusReasonMapping.put(204, "No Content");
        statusReasonMapping.put(301, "Moved Permanently");
        statusReasonMapping.put(302, "Moved Temporarily");
        statusReasonMapping.put(304, "Not Modified");
        statusReasonMapping.put(400, "Bad Request");
        statusReasonMapping.put(401, "Unauthorized");
        statusReasonMapping.put(403, "Forbidden");
        statusReasonMapping.put(404, "Not Found");
        statusReasonMapping.put(500, "Internal Server Error");
        statusReasonMapping.put(501, "Not Implemented");
        statusReasonMapping.put(502, "Bad Gateway");
        statusReasonMapping.put(503, "Service Unavailable");
    }

    private static void initMimeMapping(){
        /*
         * 解析项目目录中的conf目录里的web.xml文件
         * 将根元素中的所有子元素<mime-mapping>
         * 解析出来，并将其中的子元素:
         * <extension>中的文本作为key
         * <mime-type>中的文本作为value
         * 存入到mimeMapping这个Map中，完成
         * 初始化操作。
         */
        try {
            SAXReader reader = new SAXReader();
            Document doc = reader.read(new File("D:\\codeSource\\myself\\bqss\\webserver\\conf\\web.xml"));
            Element root = doc.getRootElement();
            List<Element> list = root.elements("mime-mapping");
            for(Element mime : list){
                String key = mime.elementText("extension");
                String value = mime.elementText("mime-type");
                mimeMapping.put(key, value);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
//        mimeMapping.put("html", "text/html");
//        mimeMapping.put("png", "image/png");
//        mimeMapping.put("jpg", "image/jpeg");
//        mimeMapping.put("gif", "image/gif");
//        mimeMapping.put("css", "text/css");
//        mimeMapping.put("js", "application/javascript");
    }

    public static String getStatus(int code){
        return statusReasonMapping.get(code);
    }

    public static String getMimeType(String mime){
        return mimeMapping.get(mime);
    }

}
