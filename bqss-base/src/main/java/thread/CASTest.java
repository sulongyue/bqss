package thread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author jinguobiao
 * @Descriprion
 * @createTime 2022/8/9
 */
public class CASTest {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger();
        System.err.println(atomicInteger.getAndIncrement());
        System.err.println(atomicInteger.incrementAndGet());
    }
}
