package thread.think;

/**
 * @Description TODO
 * @Date 2023/2/9 15:21
 * @Created by 18355
 */
public class InnerThread1 {
    private int countDown = 5;
    private Inner inner;

    private class Inner extends Thread{
        Inner(String name){
            super(name);
            start();
        }
        public void run(){
            //TODO
        }
    }

    public InnerThread1(String name){
        inner = new Inner(name);
    }
}

class InnerThread2{
    private int countDown = 5;
    private Thread t;
    public InnerThread2(String name) {
        t = new Thread(name) {
            public void run() {//TODO}
            }
        };
        t.start();
    }
}

class InnerRunnable1{
    private int countDown = 5;
    private Inner inner;

    private class Inner implements Runnable{
        Thread t;

        Inner(String name){
            t = new Thread(this,name);
            t.start();
        }
        @Override
        public void run() {
            //TODO
        }
    }

    public InnerRunnable1(String name){
        inner = new Inner(name);
    }
}

class InnerRunnable2{
    private int countDown = 5;
    private Thread t;
    public InnerRunnable2(String name){
        t = new Thread(new Runnable() {
            @Override
            public void run() {
                //TODO
            }
        }, name);
    }
}

class ThreadMethod{
    private int countDown = 5;
    private Thread t;
    private String name;
    public ThreadMethod(String name){
        this.name = name;
    }
    public void runTask(){
        if(t == null){
            t = new Thread(name){
                public void run(){
                    try{
                         System.err.println(this);

                    }catch (Exception e){

                    }
                }
            };
            t.start();
        }
    }

}
