package thread.think.exceprionThread;

import java.util.concurrent.ThreadFactory;

/**
 * @Description TODO
 * @Date 2023/2/9 16:46
 * @Created by 18355
 */
public class ExceptionThread2 implements Runnable{
    @Override
    public void run() {
        Thread t = Thread.currentThread();
        System.err.println("run() by "+ t);
        System.err.println("eh = " + t.getUncaughtExceptionHandler());
        throw new RuntimeException("出错啦zz");
    }
}

class MyUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler{

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.err.println("caught " + e + "by "+t.getName());
    }
}

class HandlerThreadFactory implements ThreadFactory{

    @Override
    public Thread newThread(Runnable r) {
        System.err.println(this + "creating new Thread");
        Thread t = new Thread(r);
        System.err.println("created " + t);
        t.setUncaughtExceptionHandler(new MyUncaughtExceptionHandler());
        System.err.println("eh = "+ t.getUncaughtExceptionHandler());
        return t;
    }
}
