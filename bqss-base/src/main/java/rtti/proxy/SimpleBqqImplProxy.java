package rtti.proxy;

/**
 * @Description TODO
 * @Date 2023/2/3 15:00
 * @Created by 18355
 */
public class SimpleBqqImplProxy implements SimpleBqq{

    private SimpleBqqImpl simpleBqq;

    public SimpleBqqImplProxy(SimpleBqqImpl simpleBqq){
        this.simpleBqq = simpleBqq;
    }

    @Override
    public void name() {
        System.err.println("proxy prepare to invoke name()");
        simpleBqq.name();
    }

    @Override
    public int age() {
        System.err.println("proxy prepare to invoke agezz()");
        return simpleBqq.age();
    }
}
