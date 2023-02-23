package thread;

/**
 * @author jinguobiao
 * @Descriprion
 * @createTime 2022/7/15
 * 线程概述
 *      线程就是独立的代码运行路径
 *      再程序运行时，即使没有自己创建线程，后台也会有多个线程，如主线程，gc线程。
 *      main()称之为主线程，为系统的入口。
 *      在一个进程中，如果开辟了多个线程，线程的运行由调度器安排
 *      线程会带来额外的开销，如cpu调度时间，并发控制开销。
 */
public class TestThread {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
        thread.start();

    }
}
