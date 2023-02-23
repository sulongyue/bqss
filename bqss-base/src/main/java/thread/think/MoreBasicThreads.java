package thread.think;

/**
 * @Description TODO
 * @Date 2023/2/9 11:29
 * @Created by 18355
 */
public class MoreBasicThreads {
    public static void main(String[] args) {
        for (int i = 0; i< 5;i++){
            new Thread(new LiftOff()).start();
            System.err.println("waiting for LiftOff");
        }
    }
}
