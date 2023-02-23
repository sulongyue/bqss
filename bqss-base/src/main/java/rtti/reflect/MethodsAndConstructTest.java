package rtti.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @Description TODO
 * @Date 2023/2/3 14:48
 * @Created by 18355
 */
public class MethodsAndConstructTest {
    public static void main(String[] args) {
        Class<MethodsTest> cc = MethodsTest.class;
        Method[] methods = cc.getDeclaredMethods();
        for(Method m : methods){
            System.err.println(m);
        }
        Constructor<?>[] constructors = cc.getConstructors();
        for(Constructor c : constructors){
            System.err.println(c);
        }
    }
}
