package thread;

/**
 * @author jinguobiao
 * @Descriprion 测试ThreadLocal的使用
 * @createTime 2022/8/8
 */
public class Demo2 {

    ThreadLocal<String> tl = new ThreadLocal<>();
    String str = "";

    public String getStr() {
        //return str;
        return tl.get();
    }

    public void setStr(String str) {
        //this.str = str;
        tl.set(str);
    }

    public static void main(String[] args) {
        Demo2 demo = new Demo2();
        for(int i=0;i<5;i++){
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    //synchronized (demo1){
                    demo.setStr(Thread.currentThread().getName()+"的数据");
                    System.err.println("---------------");
                    System.err.println(Thread.currentThread().getName()+"--->"+demo.getStr());
                    //}
                }
            });
            thread.setName("线程"+i);
            thread.start();
        }
    }
}
