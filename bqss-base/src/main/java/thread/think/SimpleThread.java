package thread.think;

/**
 * @Description TODO
 * @Date 2023/2/9 15:05
 * @Created by 18355
 */
public class SimpleThread extends Thread{

    private int countDown = 5;
    private static int threadCount = 0;
    public SimpleThread(){
        //设置线程名称
        super(Integer.toString(++threadCount));
        start();
    }

    public String toString(){
        return "#"+getName()+"(" + countDown + ")";
    }
    public void run(){
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
