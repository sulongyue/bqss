package thread.think;

import java.util.concurrent.Callable;

/**
 * @Description
 * 如果你想获取任务执行的结果，那么我们使用callable这个接口
 * @Date 2023/2/9 14:29
 * @Created by 18355
 */
public class TaskWithResult implements Callable<String> {
    private int id;
    public TaskWithResult(int id){
        this.id = id;
    }

    @Override
    public String call() throws Exception {
        if(id == 3)
            Thread.sleep(3000);
        return "result of TaskWithResult " + id;
    }
}
