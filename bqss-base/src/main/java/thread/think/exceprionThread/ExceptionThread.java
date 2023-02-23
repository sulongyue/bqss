package thread.think.exceprionThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Description
 * 线程run方法中抛出的异常不会被主线程的try catch捕获，一旦你的run方法中的异常没有被处理
 * 他就会传播到控制台。并且这个线程不会立即停止，而是等一会再停止。
 * @Date 2023/2/9 16:42
 * @Created by 18355
 */
public class ExceptionThread implements Runnable{
    @Override
    public void run() {
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        //如果你的代码中处处都使用相同的异常处理器，那么可以这样简单的设置。这样线程发生异常，会先检查有没有自己的异常处理器，没有就用这个。
        System.err.println(Thread.currentThread().getName());
        Thread.setDefaultUncaughtExceptionHandler(new MyUncaughtExceptionHandler());
        ExecutorService exec = Executors.newCachedThreadPool();
        try{
            exec.execute(new ExceptionThread());
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
