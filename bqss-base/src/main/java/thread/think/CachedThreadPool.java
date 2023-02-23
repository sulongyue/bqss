package thread.think;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Description 使用executor（执行器来帮我们管理线程）
 * @Date 2023/2/9 14:23
 * @Created by 18355
 */
public class CachedThreadPool {
    public static void main(String[] args) {
        //ExecutorService executorService = Executors.newCachedThreadPool();
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        //ExecutorService executorService = Executors.newSingleThreadExecutor();
        for(int i = 0; i < 5; i++){
            executorService.execute(new LiftOff());
        }
        executorService.shutdown();//调用该方法防止新的任务提交给Executor.但之前提交的任务会被执行完
    }
}
