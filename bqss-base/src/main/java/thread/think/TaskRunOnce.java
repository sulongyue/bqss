package thread.think;

/**
 * @Description TODO
 * @Date 2023/2/9 15:40
 * @Created by 18355
 */
public class TaskRunOnce {
    private String s;
    private int i;
    private Thread t;
    public TaskRunOnce(String s,int i){
        this.s = s;
        this.i = i;
        t = new Thread(new Runnable() {
            @Override
            public void run() {
                //execute you task
            }
        });
    }

    public void runTask(){
        t.start();
    }

}
