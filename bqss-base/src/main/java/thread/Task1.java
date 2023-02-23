package thread;

/**
 * @author jinguobiao
 * @Descriprion runable接口创建线程
 * @createTime 2022/8/7
 */
public class Task1 implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
