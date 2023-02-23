package thread.think;

/**
 * @Description
 * 线程可以驱动任务，我们编写多线程的目的就是要并发执行多个任务
 * 编写任务的方式一，实现Runnable接口
 * @Date 2023/2/9 11:16
 * @Created by 18355
 */
public class LiftOff implements Runnable{

    protected int countDown = 10;
    private static int taskCount = 0;
    private final int id = taskCount++;

    public LiftOff(){}

    public LiftOff(int countDown){
        this.countDown = countDown;
    }

    public String status(){
        return "#" + id + "("
                +(countDown>0? countDown : "Lifioff!") +").";
    }

    @Override
    public void run() {
        //设置线程的优先级，一般在run方法的最开头。在线程的构造器中设置没什么用，因为线程还没运行
        //可以在任何任务中通过Thread.currentThread()获取执行当前任务的线程
        Thread.currentThread().setPriority(Thread.NORM_PRIORITY);
        Thread.currentThread().setName("Thread"+id);
        System.err.println(Thread.currentThread().getName());
        while (countDown-- > 0){
            System.err.println(status());

            //Thread.yield();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
