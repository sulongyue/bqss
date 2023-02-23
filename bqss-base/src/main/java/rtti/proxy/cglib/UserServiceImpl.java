package rtti.proxy.cglib;

/**
 * @Description cglib动态代理，不需要接口被代理类有接口
 * @Date 2023/2/17 21:26
 * @Created by 18355
 */
public class UserServiceImpl {
    public int add(int i,int j){
        System.err.println("execute userServiceImpl  add method");
        return i+j;
    }
}
