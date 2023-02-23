package thread.think;

/**
 * @Description TODO
 * @Date 2023/2/9 11:23
 * @Created by 18355
 */
public class MainThread {
    public static void main(String[] args) {
        LiftOff liftOff = new LiftOff();
        //直接调用run方法并不会创建多个线程来执行这个run方法的任务。只是main线程调用一个方法
        liftOff.run();

    }
}
