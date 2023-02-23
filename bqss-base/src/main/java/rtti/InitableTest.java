package rtti;

/**
 * @Description TODO
 * @Date 2023/2/3 11:04
 * @Created by 18355
 */
public class InitableTest {
    public static void main(String[] args) {
        Class initable = Initable.class;// 用这种方式获取类对象的引用，也会先加载这个类，但不会先初始化。
        System.err.println("after creating initableClass ref");
        System.err.println(Initable.j);

        Class<? extends Number> cc = int.class;
        cc = Double.class;
//        Class<Number> cc = int.class;
//        cc = Double.class;  这样是不行的，你声明的是Number Class的引用，获取的确实int class的类对象，而int class类对象不是Number class对象的子类。

    }
}
