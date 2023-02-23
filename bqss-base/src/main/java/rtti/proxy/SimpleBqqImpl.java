package rtti.proxy;

/**
 * @Description TODO
 * @Date 2023/2/3 14:59
 * @Created by 18355
 */
public class SimpleBqqImpl implements SimpleBqq{
    @Override
    public void name() {
        System.err.println("This is SimpleBqqImpl's name()");
    }

    @Override
    public int age() {
        System.err.println("===>");
        return 27;
    }
}
