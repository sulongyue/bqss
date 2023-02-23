package rtti.proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Objects;

/**
 * @Description
 * @Date 2023/2/17 21:27
 * @Created by 18355
 */
public class UserServiceCglibProxy implements MethodInterceptor {
    private Object obj;
    public UserServiceCglibProxy(Object obj){
        this.obj = obj;
    }
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        if(Objects.nonNull(args) && args.length>0){
            int size = args.length;
            StringBuilder builder = new StringBuilder();
            for(int i = 0; i < size; i++){
                builder.append(args[i]);
                builder.append(",");
            }
            System.err.println("代理类方法拦截器获取方法参数："+builder.toString());
        }
        Object result = method.invoke(obj, args);
        return result;
    }
}
