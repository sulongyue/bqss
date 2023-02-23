package rtti.proxy;

import java.lang.reflect.Proxy;

/**
 * @Description TODO
 * @Date 2023/2/3 15:02
 * @Created by 18355
 */
public class ProxyTest {

    static void dodo(SimpleBqq simpleBqq){
        simpleBqq.age();
    }

    public static void main(String[] args) {
//        SimpleBqqImplProxy simpleBqqImplProxy = new SimpleBqqImplProxy(new SimpleBqqImpl());
//        dodo(simpleBqqImplProxy);
          SimpleBqqImpl simpleBqq = new SimpleBqqImpl();
//        dodo(simpleBqq);
        SimpleBqq o = (SimpleBqq)Proxy.newProxyInstance(SimpleBqq.class.getClassLoader(), new Class[]{SimpleBqq.class}, new DynamicProxyHandler(simpleBqq));
        System.err.println("=========>"+o.getClass());//com.sun.proxy.$Proxy0
        dodo(o);
//        Object o = Proxy.newProxyInstance(SimpleBqq.class.getClassLoader(), new Class[]{SimpleBqq.class}, new DynamicProxyHandler(simpleBqq));
//        System.err.println(o instanceof SimpleBqq);//true

    }
}
