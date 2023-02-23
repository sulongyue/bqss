package rtti.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * @Description TODO
 * @Date 2023/2/17 21:33
 * @Created by 18355
 */
public class CglibTest {
    public static void main(String[] args) {
        //可以使用Enhancer的create静态方法创建代理类
        //UserServiceImpl proxy = (UserServiceImpl)Enhancer.create(UserServiceImpl.class, new UserServiceCglibProxy(new UserServiceImpl()));
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserServiceImpl.class);
        enhancer.setCallback(new UserServiceCglibProxy(new UserServiceImpl()));
//        Object o = enhancer.create();
//        System.err.println(o.getClass());//rtti.proxy.cglib.UserServiceImpl
//        System.err.println(o instanceof UserServiceImpl); //true
        UserServiceImpl userServiceImplProxy = (UserServiceImpl) enhancer.create();
        int sum = userServiceImplProxy.add(2, 3);
        System.err.println(sum);

    }
}
