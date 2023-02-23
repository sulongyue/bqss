package thread.think;

/**
 * @Description TODO
 * @Date 2023/2/9 15:13
 * @Created by 18355
 */
public class Selfmanaged implements Runnable{

    private int countDown = 5;
    private Thread t = new Thread(this);
    public Selfmanaged(){
        t.start();
    }
    public String toString(){
        return "#"+Thread.currentThread().getName()+"(" + countDown + ")";
    }

    @Override
    public void run() {
        while(true){
            System.err.println(this);
            if(--countDown == 0)
                return;
        }
    }

    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            new SimpleThread();
        }
    }
}
