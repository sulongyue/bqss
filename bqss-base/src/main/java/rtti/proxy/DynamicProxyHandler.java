package rtti.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Description TODO
 * @Date 2023/2/3 15:05
 * @Created by 18355
 */
public class DynamicProxyHandler implements InvocationHandler {

    private Object proxied;

    public DynamicProxyHandler(Object proxied){
        this.proxied = proxied;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.err.println("准备执行代理方法");
        System.err.println("proxy:"+proxy.getClass());
        System.err.println(this.getClass().isInstance(proxy)); //false
        System.err.println(proxy.getClass().isInstance(this)); //false
        System.err.println("method:"+method);
        System.err.println("args:"+args);
        if(args != null){
            for(Object arg : args){
                System.err.println(" "+ arg);
            }
        }
        return method.invoke(proxied,args);
    }
}
