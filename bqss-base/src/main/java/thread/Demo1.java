package thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author jinguobiao
 * @Descriprion 测试不用ThreadLocal时的线程并发问题
 * @createTime 2022/8/8
 */
public class Demo1 {

    String str = "";

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        //Lock lock = new ReentrantLock();
        for(int i=0;i<10;i++){
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    //Lock lock = new ReentrantLock();  这里不行，使用lock，多线程用的lock和synchronized一样，也要是同一个lock.
                    try{

                        //lock.lock();
                        demo1.setStr(Thread.currentThread().getName()+"的数据");
                        System.err.println("---------------");
                        System.err.println(Thread.currentThread().getName()+"--->"+demo1.getStr());
                    }catch (Exception e){
                       e.printStackTrace();
                    }finally {
                        //lock.unlock();
                    }
//                        demo1.setStr(Thread.currentThread().getName()+"的数据");
//                        System.err.println("---------------");
//                        System.err.println(Thread.currentThread().getName()+"--->"+demo1.getStr());
                }
            });
            thread.setName("线程"+i);
            thread.start();
        }
    }
}
