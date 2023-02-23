package thread.think;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @Description TODO
 * @Date 2023/2/9 11:26
 * @Created by 18355
 */
public class BasicThreads {
    public static void main(String[] args) {
        Thread t = new Thread(new LiftOff());
        t.start();
        System.err.println("waiting for LiftOff");

//        FutureTask<String> fs = new FutureTask<>(new Callable<String>() {
//            @Override
//            public String call() throws Exception {
//                return null;
//            }
//        });
//        Thread t1 = new Thread(fs);
    }

}
