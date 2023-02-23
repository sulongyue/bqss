package thread.think.sync;

/**
 * @Description TODO
 * @Date 2023/2/9 17:29
 * @Created by 18355
 */
public abstract class IntGenerator {

    private volatile boolean canceled = false;

    public abstract int next();

    public void cancel(){
        canceled = true;
    }

    public boolean isCanceled() {
        return canceled;
    }
}
