package jvm;

import collection.TestArrayList;

/**
 * @author jinguobiao
 * @Descriprion
 * @createTime 2022/7/12
 */
public class TestClassLoader {
    static class Father{
       public static int A = 1;
       static {
           A = 2;
       }
    }

    static class Son extends Father{
        public static int B = A;
    }

    public static void main(String[] args) {
        //加载TestClassLoader 加载Son 加载Father.父类的cinit先执行完毕
        System.err.println(Son.B);

        //获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.err.println(systemClassLoader);  //sun.misc.Launcher$AppClassLoader@18b4aac2

        //获取扩展类加载器
        ClassLoader extClassLoader = systemClassLoader.getParent();
        System.err.println(extClassLoader); //sun.misc.Launcher$ExtClassLoader@7ea987ac

        //获取不到引导类加载器
        ClassLoader parent = extClassLoader.getParent();
        System.err.println(parent); //null

        /**
         * 用户自定义的类由系统类加载器加载
         * jdk自带的核心类由引导类加载器加载
         */
        System.err.println(TestArrayList.class.getClassLoader());   //sun.misc.Launcher$AppClassLoader@18b4aac2
        System.err.println(String.class.getClassLoader());  //null
        System.err.println(ClassLoader.class.getClassLoader()); //null



    }
}
