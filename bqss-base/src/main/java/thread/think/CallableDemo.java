package thread.think;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @Description TODO
 * @Date 2023/2/9 14:32
 * @Created by 18355
 */
public class CallableDemo {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        ArrayList<Future<String>> results = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            results.add(exec.submit(new TaskWithResult(i)));
        }

        for(Future<String> fs : results){
            try {
                //if(fs.isDone()){
                    //future.isDone()判断任务是否会完成，如果任务没完成就调用future.get()，程序会阻塞，直到线程任务结果
                    String s = fs.get();
                    System.err.println(s);
                //}
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }finally {
                exec.shutdown();
            }
        }
    }
}
