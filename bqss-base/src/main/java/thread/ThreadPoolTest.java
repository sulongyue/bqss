package thread;

import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author jinguobiao
 * @Descriprion
 * @createTime 2022/8/7
 */
public class ThreadPoolTest {
    Executors e;
    public static void main(String[] args) {
        LinkedBlockingQueue<Runnable> queue = new LinkedBlockingQueue<>(3);

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, 6, 60, TimeUnit.SECONDS, queue);

        for(int i = 0;i < 10; i++){
            threadPoolExecutor.execute(new Task1());
            System.err.println("线程池中活跃线程数："+threadPoolExecutor.getPoolSize());
            if(queue.size()>0){
                System.err.println("队列中阻塞线程数："+queue.size());
            }
        }

        threadPoolExecutor.shutdown();

    }


}
